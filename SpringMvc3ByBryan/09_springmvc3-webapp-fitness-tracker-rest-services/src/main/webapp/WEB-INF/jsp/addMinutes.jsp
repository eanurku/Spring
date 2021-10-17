
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="?language=en">English</a>|<a href="?language=es">Spanish</a>

<h1>Add Minutes </h1>
<form:form commandName="exercise" >
    <table>
        <tr>
            <td><spring:message code="goal.text"/> </td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="6"><input type="submit" value="Enter"></td>
        </tr>
    </table>
</form:form>

<h1>Goal for Today : ${goal.minutes}</h1>
</body>
</html>
