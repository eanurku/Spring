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
2.packaging is war type.

3. enable auto proxy by spring Aop for Annotation based approach on AppStarter class
   **
   @EnableAspectJAutoProxy
   **
-  this is configured by default by spring-boot-starter-aop  dependency

4. create @EnableExecutionTimeCalc custom annotation
-it will be applied on methods of business classes
**
   @Target(ElementType.METHOD)
   @Retention(RetentionPolicy.RUNTIME)
   public @interface EnableExecutionTimeCalc {
   }
**
5. business class 
-@EnableExecutionTimeCalc annotation applied on  add() method 
**
   @Component
   public class SampleAdder {

     @EnableExecutionTimeCalc
     public int add(int a, int b) {
        return a + b;
     }
   }
**
6. Aspect class
-@Around advice with pointcut refers to methods on 
 which @EnableExecutionTimeCalc is applied

**
   @Component
   @Aspect
   public class ExecutionTimeAspect {

   private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(com.anurag.aop.custom.EnableExecutionTimeCalc)")
    public Object logExecutionTimeOfMethod(ProceedingJoinPoint joinpoint) throws Throwable {

        StopWatch stopWatch = new StopWatch(joinpoint.getSignature().getName());

        stopWatch.start(joinpoint.getSignature().getName());
        Object returnvalue = joinpoint.proceed();
        stopWatch.stop();

        LOGGER.info(stopWatch.prettyPrint());


        return returnvalue;
    }
   }
**

   
