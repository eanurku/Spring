1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. host static files or accessing static views:
**
<mvc:annotation-driven/>
<mvc:resources mapping="/pdfs/**" location="/pdfs/"/>
**

4. add pdfs directory under webapp folder or root folder
-keep all pdf file inside this directory