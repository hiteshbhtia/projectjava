package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employeebean;
import com.dao.Employeedao;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int projectId = Integer.parseInt(request.getParameter("projectId"));
			Employeebean bean=new Employeedao().getEmployee(projectId);
		request.setAttribute("employees",bean);
		System.out.print(bean.getSurname());
		request.getRequestDispatcher("UpdateEmployee.jsp").forward(request, response);

	}

}
