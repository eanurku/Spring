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
   
3. business class (on which methods advice is applied)
-SampleAdder class add() method will be advised
**
public class SampleAdder {

    public int add(int a, int b) {
        return a + b;
    }
}
**
4. advice 
-log the return value of methods of business class 
**
   public class AdderAfterReturnAspect {

   private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

   public void afterReturn(Object returnValue) {
   LOGGER.info("here is the return value ={}", returnValue);

   }

}
**
5. enable auto proxy by spring Aop for xml based approach
**
   <aop:aspectj-autoproxy/>
**   
-  this is equivalent to @EnableAspectJAutoProxy and configured by default 
if using spring boot starter aop in maven dependency
   
6. aop xml configuration
**
   <aop:aspectj-autoproxy/>
   
    <bean id="adder" class="com.anurag.businessclasses.SampleAdder"/>
    <bean id="adderAfterReturnAspect" class="com.anurag.aop.advices.AdderAfterReturnAspect"/>

    <aop:config>
        <aop:aspect id="aspects" ref="adderAfterReturnAspect">
            <aop:pointcut id="pointcutAfterReturning"
                          expression="execution(* com.anurag.businessclasses.SampleAdder+.*(..))"/>
            <aop:after-returning pointcut-ref="pointcutAfterReturning" method="afterReturn" returning="returnValue"/>
        </aop:aspect>
    </aop:config>
**