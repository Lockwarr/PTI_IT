<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" type="text/css" href="css/ListProfilButton.css">

<style>

</style>
</head>

<body style="background-color:#f4f4f4;">
	<div class="header">
		<div class="headerLinkProfiles">
			<form method="post">
			<a href="Login.jsp" class="buttonHeader">Login</a>
			<a href="index.jsp" class="buttonHeader">Registration</a>
			<input type="button" class="buttonHeader" name="button" value="Profiles" />
			</form>			
		</div>
	</div>

	<div style="padding-bottom:75px"></div>

	<center>
		<table style="width:60%" id="t01">
		  <tr background-color: #012e5e;>
		    <th>Username</th>
		    <th>City</th>
		    <th>Address</th>
		  </tr>
		  <%@page import="java.util.ArrayList"%>
		  <%@page import="Package_IT.User"%>
		  
		  <% 
		  ArrayList<User> val=(ArrayList)request.getSession().getAttribute("list");
	      for (User us : val) { %>
			<tr>
		    <td><%out.println(us.getUsername());%></td>
		    <td><%out.println(us.getCity());%></td>
		    <td><%out.println(us.getAddress());%></td>
		  </tr>
		 <% } %>
		</table>
	</center>	









</body>
</html>