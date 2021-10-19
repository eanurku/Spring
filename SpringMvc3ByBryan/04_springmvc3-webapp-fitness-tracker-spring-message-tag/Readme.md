1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. spring message tag
- add spring taglib in jsp file:
`<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>`
-use spring message tag with code attribute to fetch data:
`<spring:message code="goal.text"/>`

2. add properties files in classpath (src/main/resources recommended):
-messages.properties
 -goal.text=total minutes exercised today coming from messages.properties
3.add bean with exact name as "messageSource"
` 
<bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
   <property name="basename" value="messages"/>
   </bean>
`