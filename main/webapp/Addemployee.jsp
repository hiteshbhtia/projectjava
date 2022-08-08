<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<div class="container mt-3">


<form action="EmployeeController">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input name="name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="Enter Name">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Surname</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="surname" placeholder="Enter Surname">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword2">Salary</label>
    <input type="number" class="form-control" id="exampleInputPassword2" name="salary" placeholder="Enter Salary">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword3">Position</label>
    <input name="position" type="text" class="form-control" id="exampleInputPassword3" placeholder="Enter Position">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword4">Email</label>
    <input name="email" type="email" class="form-control" id="exampleInputPassword4" placeholder="Enter Email">
  </div>
  
  
  <input type="submit" class="btn btn-primary" value="Submit"/>
</form>
<div class="mt-3 align-center">
<a href="Homeservlet" class="btn btn-primary">Back to Home</a>
</div>
</div>




</body>
</html>