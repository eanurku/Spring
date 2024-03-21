1. fixing javax to jakarta package migration issues.
    * javax is not supported in tomcat 10
    * javax is migrated to jakarta in spring 6.x
    * spring 6.x need jdk17 minimum
   
3. fix maven war plugin issue
`
   <build>
   <pluginManagement>
   <plugins>

   <plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-compiler-plugin</artifactId>
   <version>3.11.0</version>
   </plugin>

   <plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-war-plugin</artifactId>
   <version>3.3.1</version>
   </plugin>

      </plugins>
    </pluginManagement>

  </build>
`