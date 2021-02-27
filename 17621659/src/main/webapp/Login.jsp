<!DOCTYPE html>
<html lang="bg">
<head>
  <title>Svetliosa</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <link rel="stylesheet" type="text/css" href="css/style2.css">
  <link rel="stylesheet" type="text/css" href="css/ListProfilButton.css">
<style>

</style>
</head>

<body style="background-color:#f4f4f4;" LINK="#FFFFFF" VLINK= "#FFFFFF" ALINK="#FFFFFF">
<div class="header">
		<div class="headerLinkProfiles">
			<a href="Login.jsp" class="buttonHeader">Login</a>
			<a href="index.jsp" class="buttonHeader">Registration</a>
			<a href="Login.jsp" class="buttonHeader">Profiles</a>			
		</div>
	</div>


<div class="ContainerMain">
	<div align="center">	
	 	<div style="padding-bottom:175px"></div>	
		<font  style="font-size:75px;  color="#012e5e">Login</font>
		<div class="ContainerLogin" >
			<form action="Login" method="post">
			  <div style="padding-bottom:75px"></div>
			  <center><font  style="font-size:15px;" color=#012e5e>Username:</font></center>
			  <input type="text" id="name" name="name" placeholder="Enter email">
			  <center><font  style="font-size:15px;" color=#012e5e>Password:</font></center>
			  <input type="password" id="pass" name="pass" placeholder="Enter a password of at least 8 characters" value="">
	   		  <button class="button">Login</button>
			</form>
		</div>
	</div>
</div>

<div class="headerBotLogin"></div>





</body>
</html>