1. use this properties for jdk source and target:
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test
   -hibernate-validator

`  
  <properties>
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
    <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-validator -->
    <!-- https://mvnrepository.com/artifact/javax.validation/validation-api -->
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>5.0.3.Final</version>
    </dependency>
  </dependencies>
`

3. @EnableWebMvc enables a java class to be  equaivalent to spring app-context.xml config
4. configuring a webapp using @Configuration,@EnableWebMvc  as alternative to using spring app-context.xml config
   `
   @Configuration
   @EnableWebMvc
   @ComponentScan(basePackages = "com.anurag")
   public class WebConfig {
   }
   `
5. configure webapp using WebApplicationInitializer as alternative to web.xml

`
public class WebAppInitializer implements WebApplicationInitializer {
   @Override
   public void onStartup(ServletContext servletContext) throws ServletException {
        WebApplicationContext appContext = getContext();
        servletContext.addListener(new ContextLoaderListener(appContext));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
   }
   private WebApplicationContext getContext() {
   AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
   appContext.setConfigLocation("com.anurag.WebConfig");
   return appContext;
   }
}`

6. hosting static resource by overriding addResourceHandlers() method of  WebMvcConfigurerAdapter class 
`   
   @Configuration
   @EnableWebMvc
   @ComponentScan(basePackages = "com.anurag")
   public class WebConfig extends WebMvcConfigurerAdapter {
      @Bean
      public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
      }
      @Override
      public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/pdfs/**").addResourceLocations("/WEB-INF/pdfs/");
      }
   }`
7. important keywords,annotations,tags
- @Configuration
- @EnableWebMvc
- @ComponentScan(basePackages = "com.anurag")
- WebApplicationInitializer interface
- WebMvcConfigurerAdapter abstract class
- @RestController