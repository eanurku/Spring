1. maven dependencies:
   -spring-boot-starter-parent 2.2.4.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test
   -spring-boot-maven-plugin
   -spring-boot-starter-jdbc
   -mysql-connector-java

**
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.4.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
  </parent>
  <properties>
    <java.version>11</java.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <exclusions>
        <exclusion>
          <groupId>org.junit.vintage</groupId>
          <artifactId>junit-vintage-engine</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
    </dependency>

  </dependencies>
**
2. configure  viewResolver explicitly

**
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public static InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
**
3. implements CommandLineRunner to run code while starting web app

**
@SpringBootApplication
@ImportResource("classpath:jdbc-config.xml")
public class AppStartup extends SpringBootServletInitializer implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(AppStartup.class);
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("running............");
        jdbcTemplate.update("update employee set firstname=? where employee_id=?",new Object[]{"abc",2});
    }
}
**
4. import xml config in spring boot web app
-apply this annotation on AppStartup class with @SpringBootApplication at class level.
**
   @ImportResource("classpath:jdbc-config.xml")
**