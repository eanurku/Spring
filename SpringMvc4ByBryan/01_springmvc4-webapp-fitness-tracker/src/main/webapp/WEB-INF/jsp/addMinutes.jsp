
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(document).ready(
            function () {

                $.getJSON("http://localhost:8080/01_springmvc4_webapp_fitness_tracker_war/activities.json",
                    {ajax: 'true'},
                    function (data) {
                    console.log(data);
                        var len = data.length;
                        var html = '<option value="">--select any one-- </option>'
                        for (var i = 0; i < len; i++) {
                            html += '<option value="' + data[i].name + '">' + data[i].name + '</option>';
                        }
                        html += '</option>';
                        $('#activities').html(html);
                    }
                );
            }
        );
    </script>
</head>
<body>
<a href="?language=en">English</a>|<a href="?language=es">Spanish</a>

<h1>Add Minutes </h1>
<form:form commandName="exercise" >
    <table>
        <tr>
            <td><spring:message code="goal.text"/> </td>
            <td><form:input path="minutes"/></td>
            <td><form:select id="activities" path="activity"/></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Enter"></td>
        </tr>
    </table>
</form:form>

<h1>Goal for Today : ${goal.minutes}</h1>
</body>
</html>
