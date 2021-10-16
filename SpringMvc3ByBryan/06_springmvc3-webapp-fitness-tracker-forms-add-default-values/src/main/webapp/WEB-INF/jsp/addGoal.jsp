
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Goal</title>
</head>
<body>
<h1>Add Goal</h1>
<form:form commandName="goal">
    <table>
        <tr>
            <td>Enter today Goal:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter">
            </td>
        </tr>
    </table>

</form:form>
</body>
</html>
