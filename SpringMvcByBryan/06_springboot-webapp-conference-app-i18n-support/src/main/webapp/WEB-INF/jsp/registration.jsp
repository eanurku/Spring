<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<h1>Registration page</h1>
<a href="?lang=en">English</a>|<a href="?lang=es">spanish</a>
<form:form modelAttribute="registration">

    <form:label path="name"><spring:message code="registration.name"/> </form:label>
    <form:input path="name"/>
    <br>
    <form:label path="email"><spring:message code="registration.email"/> </form:label>
    <form:input path="email"/>
    <br>
    <input type="submit" value="Submit">


</form:form>
</body>
</html>
