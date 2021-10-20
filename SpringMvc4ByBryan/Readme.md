1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test

`   
<properties>
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
</dependencies>
`

3. @EnableWebMvc enables a java class to be  equaivalent to spring app-context.xml config
4. configuring a webapp using @Configuration,@EnableWebMvc  as alternative to using web.xml
   `
   @Configuration
   @EnableWebMvc
   @ComponentScan(basePackages = "com.anurag")
   public class WebConfig {
   }
   `