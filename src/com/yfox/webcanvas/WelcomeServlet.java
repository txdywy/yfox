package com.yfox.webcanvas;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yfox.webcanvas.config.AppConfig;

@SuppressWarnings("serial")
public class WelcomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, java.io.IOException {
		request.setAttribute("appId", AppConfig.APP_ID);
		RequestDispatcher welcomeDispatcher = request.getRequestDispatcher("/views/welcome.jsp");
		welcomeDispatcher.forward(request, response);
	}
}