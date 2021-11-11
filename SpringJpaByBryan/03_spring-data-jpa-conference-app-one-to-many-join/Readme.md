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

3.@GeneratedValue strategy
- default strategy create hibernate_sequence table and next_id_value column
- next_id_value will increment by one if used.
-to use mysql auto increment functionality,add IDENTITY strategy.
** 
@GeneratedValue(strategy=GenerationType.IDENTITY)
**

4. oneToMany join type

-one to many relation from Registration to courses.
-Registration class code changes

    **
    @OneToMany(mappedBy = "registration")
    @JsonManagedReference
    private List<Course> courses=new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    **
-Course class changes
**

    @ManyToOne
    @JsonBackReference
    private Registration registration;

    public Registration getRegistration() {
    return registration;
    }
    public void setRegistration(Registration registration) {
    this.registration = registration;
    }

**
5. fetch Registration data issue
issue:
-there is infinite loop of registration and course object due to biderection relationship
solution:
-use   @JsonManagedReference on Registration class and   @JsonBackReference on course class to make it.
   
6. EntityManager find() method to fetch table data
**
entityManager.find(Registration.class,id)
**


