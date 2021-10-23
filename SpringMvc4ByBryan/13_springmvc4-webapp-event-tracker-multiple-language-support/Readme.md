1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test

`    <properties>
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
    </dependencies>`

2. spring message tag
-using spring message tag to fetch from messages resource bundles
`<spring:message code="attendee.name.text"/>`
-message resource bundle
 -messages.properties
   -attendee.name.text=Enter Attendee name :
   -attendee.email.text=Enter Attendee Email :
 -messages_es.properties
   -attendee.name.text=Ingrese el nombre del asistente :
   -attendee.email.text=Ingrese el correo electrónico del asistente :\
3. WebConfig changes
 -messageResource bean(autowired by name)
 -localeResolver bean(autowired by name)
 -override addInterceptors() method of WebMvcConfigurerAdapter class
`
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.anurag")
public class WebConfig extends WebMvcConfigurerAdapter {
    //START:multiple language support
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.ENGLISH);
        return localeResolver;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("language");
        registry.addInterceptor(localeChangeInterceptor);
    }
    //END:multiple language support
}
`
4. append language attribute in url for language changes.
  ` <a href="?language=en">English</a>|<a href="?language=es">Spanish</a>`