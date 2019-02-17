<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course registration</title>
<style type="text/css">
.error	{ 
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
	<form:form action="processForm" modelAttribute="course">
		
		<p>
			<label for="a">Course name:</label>
			<form:input id="a" path="courseName" />
			<form:errors id="a" path="courseName" cssClass="error" />
		</p>
		<p>
			<label for="b">Start date:</label>
			<form:input id="b" type="date" path="startDate" />
			<form:errors id="b" path="startDate" cssClass="error" />
		</p>
		<p>
			<label for="c">Duration:</label>
			<form:input id="c" path="weekDuration" />
			<form:errors id="c" path="weekDuration" cssClass="error" />
		</p>
		<br>
		<br>

		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>