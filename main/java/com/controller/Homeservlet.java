package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employeebean;
import com.dao.Employeedao;

public class Homeservlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	Employeedao dao=new Employeedao();
	ArrayList<Employeebean> bean= dao.getAllEmployees();
	req.setAttribute("allemployees", bean);
	req.getRequestDispatcher("home.jsp").forward(req, res);
}
}
