<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="style1.css">
<link rel="stylesheet" href="bootstrap.min.css">


</head>
<body>
<div class="container">
<br><br>
<h2 class="display-4">Students Registration Form</h2>
<hr>
<form name="frm" method="post" action="Register">
<table>
<tr>
<td>UserID
<td><input type="text" name="id" class="form-control" autocomplete="off" required>
<td width="20px">
<td><div id="stat"></div>
</tr>

<tr>
<td>Password
<td><input type="password" name="ps" class="form-control" required onfocus="makeGetRequest()">
</tr>

<tr>
<td>Name
<td><input type="text" name="nm" class="form-control" required>
</tr>

<tr>
<td>City
<td><input type="text" name="ct" class="form-control" required>
</tr>

<tr>
<td>State
<td><input type="text" name="st" class="form-control" required>
</tr>

<tr>
<td>Mobile
<td><input type="text" name="mo" class="form-control" required>
</tr>

<tr>
<td>EmailID
<td><input type="email" name="eml" class="form-control" required>
</tr>

<tr>
<td>InstituteName
<td><input type="text" name="in" class="form-control" required>
</tr>

<tr>
<td>Department
<td><input type="text" name="dt" class="form-control" required>
</tr>



<tr>
<td><input type="submit" value="Register" class="btn btn-secondary">
<td>
</tr>

</table>

</form>
<br>
<p>Please login, if already have an account! <a href="index.jsp">Login Here</a></p>

</div>
</body>
</html>