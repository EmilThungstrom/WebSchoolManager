<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration form</title>
<style type="text/css">
.error {
	color: red
}
form  	{ 
	display: table; 
}
p     	{ 
	display: table-row; 
}
label 	{ 
	display: table-cell; 
	padding-right: 15px 
}
input 	{ 
	display: table-cell; 
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">

		<p>		
			<label for="a">First name:</label>
			<form:input id="a" path="firstName" />
			<form:errors id="a" path="firstName" cssClass="error" />
		</p>
		<p>
			<label for="b">Surname:</label>
			<form:input id="b" path="LastName" />
			<form:errors id="b" path="lastName" cssClass="error" />
		</p>
		<p>
			<label for="c">Email:</label>
			<form:input id="c" path="email" />
			<form:errors id="c" path="email" cssClass="error" />
		</p>
		<p>
			<label for="d">Address:</label>
			<form:input id="d" path="address" />
			<form:errors id="d" path="address" cssClass="error" />
		</p>

		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>