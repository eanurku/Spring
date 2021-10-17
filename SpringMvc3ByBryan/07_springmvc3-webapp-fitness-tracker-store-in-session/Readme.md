1.   spring 3.2.0.RELEASE will be supported in jdk7 but not after that
     `<properties>
     <maven.compiler.source>1.7</maven.compiler.source>
     <maven.compiler.target>1.7</maven.compiler.target>
     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
     </properties>`
2. use jdk 1.7 to compile and build project .
3. goal attribute is present in Model Object
4. add @SessionAttributes("goal") on GoalController to keep goal attribute of Model in session storage. 