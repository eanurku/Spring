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
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>5.0.3.Final</version>
        </dependency>
    </dependencies>
`

2. add hibernate-validator maven dependency
-hibernate-validator 
`<dependency>
<groupId>org.hibernate</groupId>
<artifactId>hibernate-validator</artifactId>
<version>5.0.3.Final</version>
</dependency>`
-validation-api of javax.validation 
 -transitive dependency of hibernate-validator 
 -so automatically pulled
3. uses @valid ,BindingResult class 
4. use spring <form:errors> tags to  show errors on jsp page
5. if language change interceptor is active then
- based on language attribute value in url hibernate provide internationalization support 
  for that validator annotation.
- hibernate will show error message of related annotation in particular language 
- example for @Size annotation,if language=es ,then spanish error message for @Size is 
  provided by hibernate-validator libaray.same is fetched by spring and shown on jsp page.
