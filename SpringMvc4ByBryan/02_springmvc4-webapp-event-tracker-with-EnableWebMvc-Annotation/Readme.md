1. maven dependencies:
-spring-boot-starter-parent: 1.0.2.RELEASE
-spring-boot-starter-web
-spring-boot-starter-test

2. @EnableWebMvc enables a java class to be  equaivalent to spring app-context.xml config
3. configuring a webapp using @Configuration,@EnableWebMvc  as alternative to using web.xml
`
@Configuration
@EnableWebMvc
public class WebConfig {
}
`