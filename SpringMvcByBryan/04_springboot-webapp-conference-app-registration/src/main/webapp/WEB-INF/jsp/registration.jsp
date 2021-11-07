<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<h1>Registration page</h1>
<form:form modelAttribute="registration">

    <form:label path="name">Enter name :</form:label>
    <form:input path="name"/>
    <br>
    <form:label path="email">Enter email :</form:label>
    <form:input path="email"/>
    <br>
    <input type="submit" value="Submit">


</form:form>
</body>
</html>
