1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. forward:
-it redirect to another @controller handler method but keep the request URL as same.
-request body  will be same.
2.redirect
-it redirect to another @controller handler method after closing current request and creating new web request.
-so request URL will be changed to new one
-as new web request is created so,previous request body is not saved.