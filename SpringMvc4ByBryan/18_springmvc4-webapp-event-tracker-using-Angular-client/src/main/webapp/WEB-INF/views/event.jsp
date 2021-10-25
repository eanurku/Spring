<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>event page</title>
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

<form:form commandName="event">
    <form:errors path="*" cssClass="commonErrorBlock" element="div"/>

    <form:label path="eventName" cssErrorClass="error">Enter Event name :</form:label>
    <form:input path="eventName" cssErrorClass="errorBox"/>
    <form:errors path="eventName" cssClass="error"/>
    <br/>
    <input type="submit" class="btn" value="Click for submit">
    
</form:form>

</body>
</html>
