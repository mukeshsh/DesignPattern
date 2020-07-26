package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.delegate.CricketerDetailsDelegate;
import com.nt.delegate.CricketerDetailsDelegateImpl;
import com.nt.vo.BatsmanInputsVO;
import com.nt.vo.BatsmanProfileVO;


public class MainControllerServlet extends HttpServlet {
		
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nickName=null,country=null;
		BatsmanInputsVO ipVO=null;
		CricketerDetailsDelegate delegate=null;
		BatsmanProfileVO profileVO=null;
		RequestDispatcher rd=null;
		//read form data
		nickName=req.getParameter("nickName");
		country=req.getParameter("country");
		//create inputVo class obj having form data
		ipVO=new BatsmanInputsVO();
		ipVO.setNickName(nickName);
		ipVO.setCountry(country);
		//create b. delegate obj
		try {
			delegate=new CricketerDetailsDelegateImpl();
			profileVO=delegate.findCricketerDetails(ipVO);
		}
		catch(IllegalArgumentException iae) {
			rd=req.getRequestDispatcher("error.jsp");
			rd.forward(req, resp);
			return;
		}
		//keep result in request scope
		req.setAttribute("profile",profileVO);
		//forword to result page
		rd=req.getRequestDispatcher("show_details.jsp");
		
		rd.forward(req, resp);
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
