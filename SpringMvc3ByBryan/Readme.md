1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. maven dependency for mvc 3 webapp:
   -spring mvc 3.1.2.RELEASE
   -servlet-api 2.5 provided
   -jstl 1.2 provided

`  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>3.1.2.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>`


2.web.xml:
default genderated:
**
`<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >
<web-app>
<display-name>Archetype Created Web Application</display-name>
</web-app>`
**


for servlet 2.4:
**
`<web-app id="WebApp_ID" version="2.4"
xmlns="http://java.sun.com/xml/ns/j2ee"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee
http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
<display-name>Archetype Created Web Application</display-name>
</web-app>`
**


3.spring servlet config:
**
`<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:context="http://www.springframework.org/schema/context"
xmlns:mvc="http://www.springframework.org/schema/mvc"
xmlns:tx="http://www.springframework.org/schema/tx"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context.xsd
http://www.springframework.org/schema/mvc
http://www.springframework.org/schema/mvc/spring-mvc.xsd
http://www.springframework.org/schema/tx
http://www.springframework.org/schema/tx/spring-tx.xsd">
</beans>`
**

4. explicit loading of spring servlet config:
**
`   <servlet>
   <servlet-name>fitnessTracker</servlet-name>
   <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
   <init-param>
   <param-name>contextConfigLocation</param-name>
   <param-value>/WEB-INF/config/servlet-config.xml</param-value>
   </init-param>
   </servlet>`
**
5. maven dependency for MVC 3 webapp (supporting validation,REST web services):
   -spring mvc 3.1.2.RELEASE
   -servlet-api 2.5 provided
   -jstl 1.2 provided
**
   <properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   <spring-version>3.2.0.RELEASE</spring-version>
   </properties>

  <dependencies>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>${spring-version}</version>
    </dependency>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>4.2.0.Final</version>
    </dependency>

    <dependency>
      <groupId>org.codehaus.jackson</groupId>
      <artifactId>jackson-mapper-asl</artifactId>
      <version>1.4.1</version>
    </dependency>
    <dependency>
      <groupId>com.thoughtworks.xstream</groupId>
      <artifactId>xstream</artifactId>
      <version>1.3.1</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-oxm</artifactId>
      <version>${spring-version}</version>
    </dependency>

  </dependencies>
**
6. important keywords,tags,annotations
- `<mvc:annotation-driven/>`
- `<context:component-scan base-package="com.anurag"/>`
- `<mvc:resources mapping="/pdfs/**" location="/pdfs/"/>`
- `<mvc:resources mapping="/*.js" location="/"/>`
- `@ResponseBody`
- `<spring:message code="goal.text"/>`
- `<form:form commandName="exercise" > ....</form:form>`
- `@SessionAttributes("goal")`
- `"redirect:addMoreMinutes"`
- `"forward:addMoreMinutes"`

7. fixing javax to jakarta package migration issues for deployment on tomcat 10
    * javax is not supported in tomcat 10
    * javax is migrated to jakarta in spring 6.x
    * spring 6.x need jdk17 minimum
    * fix maven war plugin issue
   `
   <build>
   <pluginManagement>
   <plugins>

   <plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-compiler-plugin</artifactId>
   <version>3.11.0</version>
   </plugin>

   <plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-war-plugin</artifactId>
   <version>3.3.1</version>
   </plugin>

      </plugins>
    </pluginManagement>

    </build>
    `