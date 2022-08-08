package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employeebean;
import com.dao.Employeedao;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Employeedao dao=new Employeedao();
		String name=req.getParameter("name");
		String surname=req.getParameter("surname");
		String email=req.getParameter("email");
		String position=req.getParameter("position");
		int salary=Integer.valueOf(req.getParameter("salary"));

		int projectId = Integer.parseInt(req.getParameter("id"));
		Employeebean bean=new Employeebean();
		bean.setEmail(email);
		bean.setName(name);
		bean.setSurname(surname);
		bean.setSalary(salary);
		bean.setPosition(position);
		bean.setId(projectId);
		dao.UpdateEmployee(bean);
		res.sendRedirect("Homeservlet");
	}
}
