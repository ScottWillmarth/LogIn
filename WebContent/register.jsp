<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function empty() 
{
    var x,y,z;
    x = document.getElementById("newUS").value;
    y = document.getElementById("newPass").value;

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

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="registerServlet" method="POST">
    	Please Enter Your Name: <input type="text" name="newName" id="newName"> <br><br>
    	Create a Username: <input type="text" name="newUN" id="newUN"> <br><br>
    	Create a Password: <input type="text" name="newPass" id="newPass"> <br><br>
    	<input type="submit" value="Submit" onClick="return empty()"/>
	</form>
</body>
</html>