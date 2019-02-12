<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 


<!DOCTYPE HTML>
<html>



<head>
    <title>Student Form</title>
</head>

<body>
<form:form action="studentDetails" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		
	
		<br><br>
	<%-- 	Country :<form:select path="country">
			<form:option value="India" lable="india"></form:option>
			<form:option value="delhi" lable = "delhi"></form:option>
			<form:option value="faridabad" lable = "faridabad"></form:option>
		</form:select> --%>
		
			Country :<form:select path="country">
				<form:options items ="${student.countryOption}"/>
				
			</form:select>
	
		<br><br>
		
		language:
		
		java <form:radiobutton path="language" value ="java"/>
		php <form:radiobutton path="language" value ="php"/>
		ruby <form:radiobutton path="language" value ="ruby"/>
		<br><br>
	
		 <input type="submit" value="Submit" />
	</form>
	
	</form:form>

</body>

</html>
