<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<script type="text/javascript">
function empty() 
{
    var x,y,z;
    x = document.getElementById("yourUS").value;
    y = document.getElementById("yourPass").value;

    if (x == "") 
    {
    	alert("Enter a Valid input");
        return false;
    }
    else if (y == "") 
    {
        alert("Enter a Valid input");
        return false;
    };
}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log-in Page</title>
</head>
<body>
    <form action="loginServlet" method="POST">
    User name: <input type="text" name="yourUN" id="yourUN"> <br><br>
    Password: <input type="text" name="yourPass" id="yourPass"> <br><br>
    <input type="submit" value="Log in" onClick="return empty()"/>
	</form>
	
	<button onclick="window.location.href='register.jsp'">Register</button>
</body>
</html>