1. maven dependency:
    -spring mvc 3.1.2.RELEASE
    -servlet-api 2.5 provided
    -jstl 1.2 provided

**
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
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>
**
  
2. web.xml for servlet 2.5
**
   <web-app id="WebApp_ID" version="2.4"
   xmlns="http://java.sun.com/xml/ns/j2ee"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee
   http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
**
3. web.xml 
  -if servlet name is fitnessTracker then web.xml by default look for fitnessTracker-servlet.xml file
   as per convention of [servlet name]-servlet.xml
 