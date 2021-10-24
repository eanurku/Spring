1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test
   -hibernate-validator

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

2. hibernate validator annotations types
-@Size
 -it supports mulriple error message for different  Model object
 e.g:
 Size.event.name=XXXX
 Size.attendee.name=YYYYY
-@Email,@NotEmpty
 -they do not support multiple error message but only one for annotation only.

3. add custom error message for hibernate validator annotation in message properties files.
-messages.properties
   -Size.attendee.name=name size must be between {2} to {1}
   -Email=Email is not valid
   -NotEmpty= Field must not be empty
-messages_es.properties
   -Size.attendee.name=el tamaño del nombre en español debe estar entre {2} y {1}
   -Email=El correo no es válido
   -NotEmpty=El campo no debe estar vacío
