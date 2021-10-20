1.configure spring DispatcherServlet using java class with web.xml .
`
<servlet>
<servlet-name>springDispatcherServlet</servlet-name>
<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
<init-param>
<param-name>contextConfigLocation</param-name>
<param-value>com.anurag.WebConfig</param-value>
</init-param>
<init-param>
<param-name>contextClass</param-name>
<param-value>org.springframework.web.context.support.AnnotationConfigWebApplicationContext</param-value>
</init-param>
</servlet>
`
2.WebConfig class as alternative to spring xml config

`
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.anurag")
public class WebConfig {
}
`
