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

2. configure internalResourceViewResolver for resolving view names:

`
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.anurag")
public class WebConfig {
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
        InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
`
3. add jsp files under WEB-INF directory for getting resolved.
-webapp
  -WEB-INF
    -views
      -welcome.jsp
      -event.jsp
4. Controller should just return view name without suffix
`
   @Controller
   public class HelloController {
     @RequestMapping("/greeting")
     public String welcome(Model model) {
         model.addAttribute("greeting","Welcome to Mvc 4");
         return "welcome";
     }
   }
`