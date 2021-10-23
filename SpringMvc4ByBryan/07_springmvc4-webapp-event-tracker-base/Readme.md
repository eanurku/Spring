1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test

`    <properties>
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.0.2.RELEASE</version>
        <relativePath/>
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
    </dependencies>`

2. add spring form:
-form
`
<form:form commandName="event">
<form:errors path="*" cssClass="commonErrorBlock" element="div"/>
    <form:label path="eventName" cssErrorClass="error">Enter Event name :</form:label>
    <form:input path="eventName" cssErrorClass="errorBox"/>
    <form:errors path="eventName" cssClass="error"/>
    <br/>
    <input type="submit" class="btn" value="Click for submit">
</form:form>
`
-css
`<style>
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
</style>`