<%@page import="com.bean.Employeebean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<%
ArrayList<Employeebean> bean = (ArrayList<Employeebean>) request.getAttribute("allemployees");
%>

<body>
	<div class="container mt-3">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="Homeservlet">Employee Management</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="HomeServlet">Home </a></li>
					<li class="nav-item"><a class="nav-link"
						href="Addemployee.jsp">AddEmployee</a></li>
				</ul>
			</div>
		</nav>




		<%
		if (bean.size() == 0) {
		%>
		---------no users are available------
		<%
		} else {
		%>

		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">Surname</th>
					<th scope="col">Email</th>

					<th scope="col">Salary</th>

					<th scope="col">Position</th>

					<th scope="col">Delete</th>

					<th scope="col">Edit</th>


				</tr>
			</thead>
			<tbody>
				<%
				int i=1;
				for (Employeebean b : bean) {
				%>
				<tr>
					<th scope="row"><%=i++%></th>
					<td><%=b.getName()%></td>
					<td><%=b.getSurname()%></td>
					<td><%=b.getEmail()%></td>
					<td><%=b.getSalary()%></td>
					<td><%=b.getPosition()%></td>
					<td><a href="DeleteServlet?projectId=<%=b.getId()%>">
							Delete</a> |
					<td><a href="EditServlet?projectId=<%=b.getId()%>">
							Edit </a></td>

				</tr>
				<%
				}
				%>
			</tbody>
		</table>

		<%
		}
		%>


	</div>

</body>
</html>