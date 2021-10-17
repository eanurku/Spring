
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Goal</title>
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
<h1>Add Goal</h1>

<form:form commandName="goal">

    <form:errors path="*" cssClass="commonErrorBlock" element="div"/>
    <table>
        <tr>
            <td>Enter today Goal:</td>
            <td><form:input path="minutes" cssErrorClass="errorBox"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter">
            </td>
        </tr>
    </table>

</form:form>
<%--fetch from session --%>
<h1>my current goal:${goal.minutes}</h1>
</body>
</html>
