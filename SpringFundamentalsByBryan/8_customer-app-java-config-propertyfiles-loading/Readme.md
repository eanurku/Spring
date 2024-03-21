1. create property placeholder bean using @PropertySource
   @Configuration
   @ComponentScan({ "com.anurag" })
   @PropertySource("my-app.properties")
   public class AppConfig {}
2. alternatively create property placeholder bean using @Bean
   @Bean
   public static PropertySourcesPlaceholderConfigurer propertyLoader(){
   PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
   config.setLocation(new ClassPathResource("my-app.properties"));
   return config;
   }
3. use  @value("${key}") at field level in java class