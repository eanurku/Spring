1. WebApplicationInitializer as alternative to web.xml to setup dispatcherServlet.
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
