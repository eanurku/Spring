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

4. add properties files in classpath (src/main/resources recommended):
- messages.properties
  - goal.text=total minutes exercised today coming from messages.properties

5. add bean with exact name as "messageSource"
`
   <bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
   <property name="basename" value="messages"/>
   </bean>
`


6. add language attribute to current request Url
`
<a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
`
7. add properties files in classpath for locales like en,es etc.(src/main/resources recommended )::
- messages.properties 
  - goal.text=total minutes exercised today coming from messages.properties
- messages_es.properties
  - goal.text=minutos totales ejercitados hoy procedentes de messages.properties 

8. add theses locale related beans
`   
    <bean id="localeResolver" class="org.springframework.web.servlet.i18n.SessionLocaleResolver">
        <property name="defaultLocale" value="en"/>
    </bean> 
    <mvc:interceptors>
        <bean class="org.springframework.web.servlet.i18n.LocaleChangeInterceptor" >
            <property name="paramName" value="language"/>
        </bean>
    </mvc:interceptors>
`
