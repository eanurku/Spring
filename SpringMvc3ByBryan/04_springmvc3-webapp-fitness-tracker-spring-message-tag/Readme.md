1.spring message tag
- add spring taglib in jsp file:
`<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>`
-use spring message tag with code attribute to fetch data:
`<spring:message code="goal.text"/>`

2. add properties files in classpath (src/main/resources recommended):
-messages.properties
 -goal.text=total minutes exercised today coming from messages.properties
3. 
4. add bean with exact name as "messageSource"
` 
<bean id="messageSource" class="org.springframework.context.support.ResourceBundleMessageSource">
   <property name="basename" value="messages"/>
   </bean>
`