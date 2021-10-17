1. spring 3.2.0.RELEASE will be supported in jdk7 but not after that
`<properties>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>`

2. use jdk 1.7 to compile and build project .

3. spring form tag library
`<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>`
4. sample form

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