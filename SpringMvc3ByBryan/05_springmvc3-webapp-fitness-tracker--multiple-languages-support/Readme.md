1.spring message tag
- add spring taglib in jsp file:
  `<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>`
-use spring message tag with code attribute to fetch data:
  `<spring:message code="goal.text"/>`

2. add properties files in classpath (src/main/resources recommended):
- messages.properties
  - goal.text=total minutes exercised today coming from messages.properties

3. add bean with exact name as "messageSource"
`
   <bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
   <property name="basename" value="messages"/>
   </bean>
`


4. add language attribute to current request Url
`
<a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
`
5. add properties files in classpath for locales like en,es etc.(src/main/resources recommended )::
- messages.properties 
  - goal.text=total minutes exercised today coming from messages.properties
- messages_es.properties
  - goal.text=minutos totales ejercitados hoy procedentes de messages.properties 

6. add theses locale related beans
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
