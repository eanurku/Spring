1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test

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
    </dependencies>
`
2. WebApplicationInitializer as alternative to web.xml to setup dispatcherServlet.
-add a class implementing WebApplicationInitializer interface for creating dispatcherServlet.


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
}
`

2.WebConfig class as alternative to spring xml config
`
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.anurag")
public class WebConfig {
}
`
