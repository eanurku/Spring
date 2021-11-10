
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>

<form:form modelAttribute="user">

    <form:label path="firstname">Enter first name:</form:label>
    <form:input path="firstname"/>
    <br>
    <form:label path="lastname">Enter last name:</form:label>
    <form:input path="lastname"/>
    <br>
    <form:label path="age">Enter age:</form:label>
    <form:input path="age"/>
    <br>
    <input type="submit" value="Submit"/>

</form:form>


</body>

</html>
