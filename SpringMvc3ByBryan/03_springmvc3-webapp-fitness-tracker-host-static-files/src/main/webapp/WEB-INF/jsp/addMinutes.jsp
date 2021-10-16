
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add Minutes </h1>
<form:form commandName="exercise" >
    <table>
        <tr>
            <td>total minutes of exercise done today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="6"><input type="submit" value="Enter"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
