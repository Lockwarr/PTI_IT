<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registration</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="style/design.css" type="text/css" >
   <link rel="stylesheet" href="style/style.css" type="text/css" >
    <link rel="stylesheet" href="style/main.css" type="text/css" >
</head>

<body style="background-color:#f4f4f4;" LINK="#FFFFFF" VLINK= "#FFFFFF" ALINK="#FFFFFF">
<div class="header">
   	<div class="headerLinkProfiles">
			<a href="Login.html" class="buttonHeader">Login</a>
			<a href="Registration.html" class="buttonHeader">Registration</a>	
			<a href="Login.jsp" class="buttonHeader" name="button">Profiles</a>			
   </div>
</div>
<div class="ContainerMain">
	<div align="center">	
	<div style="padding-bottom:70px"></div>	
		<font  style="font-size:75px;"  color=#012e5e>Създаване на профил</font>
		<div class="ContainerRegister" >
			<form method="post" action="Registration">
			  <div style="padding-bottom:75px"></div>
			  <center><font  style="font-size:15px;" color=#012e5e>Име:</font></center>			  
			  <input type="text" id="name" name="name" placeholder="Въведете име за контакт" >
			  
			  <center><font  style="font-size:15px;" color=#012e5e>Потребителско име:</font></center>			  
			  <input type="text" id="email" name="username" placeholder="Въведете потребителско име" >
			 
			  <center><font  style="font-size:15px;" color=#012e5e>Парола:</font></center>
			  <input type="password" id="password1" name="password1" placeholder="Въведете парола поне с 8 символа">			  
			  
			  <center><font  style="font-size:15px;" color=#012e5e>Повторете паролата:</font></center>
			  <input type="password" id="password2" name="password2" placeholder="Въведете парола поне с 8 симнола">
	   		  
	   		  <center><font  style="font-size:15px;" color=#012e5e>Телефонен номер:</font></center>
              <input type="text" id="phone" name="phone" placeholder="Въведете телефонен номер" >
              
              <center><font  style="font-size:15px;" color=#012e5e>Град</font></center>
              <input type="text" id="city" name="city" placeholder="Въведете град" >
              
              <center><font  style="font-size:15px;" color=#012e5e>Адрес:</font></center>
              <input type="text" id="address" name="address" placeholder="Въведете адрес">
              
	   		  <button class="button">Вход</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>