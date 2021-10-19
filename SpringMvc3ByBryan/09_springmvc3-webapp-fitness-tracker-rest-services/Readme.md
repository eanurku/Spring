1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
     `<properties>
     <maven.compiler.source>1.7</maven.compiler.source>
     <maven.compiler.target>1.7</maven.compiler.target>
     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
     </properties>`
2. use jdk 1.7 to create war.

3. maven dependency required
`
<dependency>
<groupId>org.codehaus.jackson</groupId>
<artifactId>jackson-mapper-asl</artifactId>
<version>1.4.1</version>
</dependency>
<dependency>
<groupId>com.thoughtworks.xstream</groupId>
<artifactId>xstream</artifactId>
<version>1.3.1</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-oxm</artifactId>
<version>${spring-version}</version>
</dependency>
`
4. 