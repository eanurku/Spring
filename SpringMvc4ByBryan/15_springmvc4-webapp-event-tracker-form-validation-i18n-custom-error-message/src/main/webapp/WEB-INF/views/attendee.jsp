<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;
        }
        .commonErrorBlock{
            color: black;
            border: solid red 3px;
            margin: 16px;
            padding: 10px;
        }
        .errorBox{
            color: red;
            border: red solid 3px;
        }
    </style>
</head>
<body>
<a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
<form:form commandName="attendee">
    <form:errors path="*" cssClass="commonErrorBlock" element="div"/>

    <form:label path="name" cssErrorClass="error"><spring:message code="attendee.name.text"/></form:label>
    <form:input path="name" cssErrorClass="errorBox"/>
    <form:errors path="name" cssClass="error"/>
    <br/>
    <form:label path="email" cssErrorClass="error"><spring:message code="attendee.email.text"/></form:label>
    <form:input path="email" cssErrorClass="errorBox"/>
    <form:errors path="email" cssClass="error"/>
    <br/>
    <input type="submit" value="Submit Form">
</form:form>

</body>
</html>
