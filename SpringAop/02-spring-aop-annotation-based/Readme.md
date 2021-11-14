1.maven dependencies
-spring-boot-starter-parent 2.2.4.RELEASE
-spring-boot-starter-web
-spring-boot-starter-test
-spring-boot-starter-tomcat  provided
-spring-boot-maven-plugin
-spring-boot-starter-aop
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
      <groupId>org.hibernate.validator</groupId>
      <artifactId>hibernate-validator</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-aop</artifactId>
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
2. packaging is war type.

3. enabling sprin aop support for  AspecJ annotation like @Aspect etc. 
-in spring xml based App
**
   <aop:aspectj-autoproxy/>  
**   
- in spring boot pure java config based app 
  **
     @EnableAspectJAutoProxy
  **
 -this is configured by default by spring-boot-starter-aop dependency 
   
4. business class (on which methods advice is applied)
-SampleAdder class add() method will be advised
**
@Component
public class SampleAdder {

    public int add(int a, int b) {
        return a + b;
    }
}
**
5. Aspect class
-pointcut defined using @Pointcut
-advice defined using @AfterReturning

**
   
   @Component
   @Aspect
   public class AdderAspect {

   private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    
    @Pointcut("execution(* com.anurag.businessclasses.SampleAdder+.*(..))")
    public void adderPointcut() {
    }

    @AfterReturning(pointcut = "adderPointcut()", returning = "returnValue")
    public void afterReturn(JoinPoint joinpoint, Object returnValue) {
        LOGGER.info("joinpoint ={}", joinpoint.getSignature().getName());
        LOGGER.info("afterReturn method return value ={}", returnValue);
    }

}
**

   
