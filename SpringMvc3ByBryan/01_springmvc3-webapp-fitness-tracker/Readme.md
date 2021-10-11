1. maven dependency:
    -spring mvc 3.1.2.RELEASE
    -servlet-api 2.5 provided
    -jstl 1.2 provided

      <dependencies>
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-webmvc</artifactId>
          <version>3.1.2.RELEASE</version>
        </dependency>
        <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>servlet-api</artifactId>
          <version>2.5</version>
        </dependency>
        <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>jstl</artifactId>
          <version>1.2</version>
        </dependency>
      </dependencies>
   
2. web.xml 
**<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >**
- if web.xml have above namespace then EL is disabled by default 
- enable EL by spring tag lib  in jsp files
   **<%@page isELIgnored="false" %>**
 