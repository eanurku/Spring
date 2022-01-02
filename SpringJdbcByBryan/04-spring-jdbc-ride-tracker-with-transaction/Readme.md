1. maven dependencies:
   -spring-boot-starter-parent 2.2.4.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test
   -spring-boot-starter-tomcat
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
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
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
3. import xml config in spring boot web app
-apply this annotation on AppStartup class with @SpringBootApplication at class level.
**
   @ImportResource("classpath:jdbc-config.xml")
**
4. create N tiered architecture based webapp 
   -controller
   -service
   -repository
   
5. exception handler method for handling runtime errors in webapp
 -add handler method in controller
 - add custom ServiceError exception for returning in response
**   
   @ExceptionHandler(RuntimeException.class)
   public ResponseEntity<ServiceError> handle(RuntimeException ex) {
        ServiceError serviceError = new ServiceError();
        serviceError.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        serviceError.setMessage(ex.getMessage());
        return new ResponseEntity<>(serviceError, HttpStatus.INTERNAL_SERVER_ERROR);
   }
**
6. use @Transactional on method performing DB updates
7. spring boot does autoconfiguration of transationManager 
 -transation manager can be explicitly configured 
**
   <tx:annotation-driven transaction-manager="txManager"/>
   <bean id="txManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
   <property name="dataSource" value="dataSource"/>
   </bean>
**