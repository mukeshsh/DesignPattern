package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.nt.cfgs.Log4jConfiguration;
import com.nt.delegate.EmployeeManagementBDelegate;
import com.nt.errors.EmployeeRegistrationProblem;
import com.nt.vo.EmployeeVO;

/**
 * Servlet implementation class MainControllerServlet
 */
@WebServlet(value="/controller",loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	private static Logger logger=Logger.getLogger(MainControllerServlet.class);
	 private EmployeeManagementBDelegate delegate;
	 static {
		 Log4jConfiguration.configure();
	 }
	@Override
	public void init() throws ServletException {
	   delegate=new EmployeeManagementBDelegate();
	   logger.info("BusinessDelegate object is created");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.debug("BusinessDelegate:: doGet(-,-)");
		EmployeeVO vo=null;   
		String resultMsg=null;
		RequestDispatcher rd=null;
		
		//read  form data and store into VO class object
		vo=new EmployeeVO();
		vo.setEname(req.getParameter("ename"));
		vo.setEadd(req.getParameter("eadd"));
		vo.setDesg(req.getParameter("desg"));
		vo.setSalary(req.getParameter("salary"));
		logger.debug("VO class object is created having form data");
		try {
			//use BusinessDelegate
			resultMsg=delegate.regsiterEmployee(vo);
			logger.debug("B.method  is invoked");
			//keep the result in request scope
			req.setAttribute("result",resultMsg);
			//forward to  show_result.jsp
			rd=req.getRequestDispatcher("show_result.jsp");
			rd.forward(req,res);
			logger.debug("Forwaring to result page");
		}
		catch(EmployeeRegistrationProblem erp) {
			erp.printStackTrace();
			//keep error page in request scope
			req.setAttribute("errMsg",erp.getMessage());
			//forward to error page..
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
			logger.debug("forwarding to error page");
		}
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.debug("doPost(-,-) method ");
		 doGet(req,res);
	}//doPost(-,-)
	
	@Override
	public void destroy() {
	  delegate=null;
	  logger.debug("Business Delegate is Nullified");
	}

}
