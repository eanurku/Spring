1.spring form tag library
`<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>`
2. sample form

`<form:form commandName="exercise" >
    <table>
        <tr>
            <td>total minutes of exercise done today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="6"><input type="submit" value="Enter"></td>
        </tr>
    </table>
</form:form>`