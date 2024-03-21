1. add spring-context in dependency
2. use @configuration,@Bean
3. appcontext.xml is replaced by @Configuration
   @Configuration at class level for AppConfig class
4. @Bean at method level
5. setter and constructor injection by calling method with @Bean associated
6. AnnotationConfigApplicationContext for loading configuration from AppConfig class