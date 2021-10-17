1.host static files or accessing static views:
**
<mvc:annotation-driven/>
<mvc:resources mapping="/pdfs/**" location="/pdfs/"/>
**

2. add pdfs directory under webapp folder or root folder
-keep all pdf file inside this directory