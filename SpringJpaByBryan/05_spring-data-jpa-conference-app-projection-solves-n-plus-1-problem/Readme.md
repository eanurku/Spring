1.maven dependencies 
 -spring-boot-starter-parent 2.2.4.RELEASE
 -spring-boot-starter-web
 -spring-boot-starter-test
 -spring-boot-maven-plugin
 -mysql-connector-java
 -spring-boot-starter-data-jpa

**
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.2.6.RELEASE</version>
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
      <artifactId>spring-boot-starter-data-jpa</artifactId>
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

2. configure mysql datasource by using hibernate
**
#data source config and logging sql statements
spring.datasource.username=root
spring.datasource.password=root1234
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect

logging.level.org.hibernate.SQL=DEBUG
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=create
**

3. N+1 problem can be solved by joining tables and here is table join through  JPQL query
-createQuery()
**
   public List<RegistrationReport> findAllReports() {
        String jpql_query="select  new com.anurag.models.RegistrationReport(r.name,c.name,c.description) " +
                "from Registration r ,Course c " +
                "where r.id=c.registration.id ";
        List<RegistrationReport> reports = entityManager.createQuery(jpql_query).getResultList();
        return reports;
   }
**
- RegistrationReport model class 
**
public class RegistrationReport {
    private String name;
    private String courseName;
    private String courseDescription;
     ----------------
     ------------------
}
**

