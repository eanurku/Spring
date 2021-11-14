<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <style type="text/css">
        .errorBlock{
            color: red;
            border: 2px solid red;
            margin: 50px;
            /*padding: 10px;*/
        }
        .error{
            color: red;
        }
        .errorBox{
            color: red;
            border: 2px solid red;
        }


    </style>
</head>
<body>
<h1>Registration page</h1>
<div>
    <a href="?lang=en">English</a>|<a href="?lang=es">spanish</a>
</div>

<form:form modelAttribute="registration">
    <form:errors path="*" cssClass="errorBlock"/>

    <br>
    <form:label path="name"><spring:message code="registration.name"/> </form:label>
    <form:input path="name" cssErrorClass="errorBox"/>
    <form:errors path="name" cssClass="error"/>
    <br>
    <form:label path="email"><spring:message code="registration.email"/> </form:label>
    <form:input path="email" cssErrorClass="errorBox"/>
    <form:errors path="email" cssClass="error"/>
    <br>
    <input type="submit" value="Submit">


</form:form>
</body>
</html>
