package com.nt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nt.model.UserDetails;

@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String user=null,pwd=null;
	UserDetails details=null;
	HttpSession session=null;
	RequestDispatcher rd=null;
		//read form data
		user=req.getParameter("uname");
		pwd=req.getParameter("pwd");
		//keep them in model object
		details=new UserDetails();
		details.setUname(user);
		details.setPwd(pwd);
		//validate username,password
		if(details.getUname().equalsIgnoreCase("mukesh") && details.getPwd().equalsIgnoreCase("siya")) {
			//keep user details in session
			session=req.getSession(true);
			session.setAttribute("details", details);
			//forword to inbox page
			rd=req.getRequestDispatcher("/inboxurl");
			rd.forward(req, resp);
		}
			else {
				req.setAttribute("errMsg", "Invalid Credential");
				//forword to login page
				rd=req.getRequestDispatcher("/login_form.jsp");
				rd.forward(req, resp);
			}
		}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

}
