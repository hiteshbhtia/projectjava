package com.controller;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Requires;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employeebean;
import com.dao.Employeedao;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Employeedao dao=new Employeedao();
		String name=req.getParameter("name");
		String surname=req.getParameter("surname");
		String email=req.getParameter("email");
		int salary=Integer.valueOf(req.getParameter("salary"));
		String position=req.getParameter("position");
		Employeebean bean=new Employeebean();
		bean.setEmail(email);
		bean.setName(name);
		bean.setSurname(surname);
		bean.setPosition(position);
		bean.setSalary(salary);
		dao.insertEmployee(bean);
		res.sendRedirect("Homeservlet");
	}
}
