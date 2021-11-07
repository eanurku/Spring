1.maven dependencies
-spring-boot-starter-parent 2.2.4.RELEASE
-spring-boot-starter-web
-spring-boot-starter-test
-spring-boot-starter-tomcat  provided 
-spring-boot-maven-plugin

`    <parent>
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
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>`
2. packaging is war type.
3.view resolver is configured explicitly
   **
   @Configuration
   public class WebAppConfig {

   @Bean
   public InternalResourceViewResolver viewResolver(){
   InternalResourceViewResolver resolver =new InternalResourceViewResolver();
   resolver.setPrefix("/WEB-INF/jsp/");
   resolver.setSuffix(".jsp");
   return resolver;
   }
   }
   **
4. add Registration jsp page and its controller to support GET and POST