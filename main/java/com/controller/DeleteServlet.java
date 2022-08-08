package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Employeedao;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Employeedao dao=new Employeedao();
		int projectId = Integer.parseInt(req.getParameter("projectId"));
		
		dao.deleteEmployee(projectId);
		res.sendRedirect("Homeservlet");
	}
}
