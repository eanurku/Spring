1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. add jquery-1.8.3.js in webapp or root directory
4. make jquery-1.8.3.js publicly accessible
`<mvc:resources mapping="/*.js" location="/"/>`
5. add javascript libary in jsp file
-add <script> tag inside html <head> tag
`    <script type="text/javascript" src="jquery-1.8.3.js"></script>`
6. make api call using ajax in jquery and create html element using returned data on the fly.
-add <script> tag code within html <head> tag 

`   
   <script type="text/javascript">
        $(document).ready(
            function () {

                $.getJSON("http://localhost:8080/10_springmvc3_webapp_fitness_tracker_using_jquery_war/activities.json",
                    {ajax: 'true'},
                    function (data) {
                    console.log(data);
                        var len = data.length;
                        var html = '<option value="">--select any one-- </option>'
                        for (var i = 0; i < len; i++) {
                            html += '<option value="' + data[i].name + '">' + data[i].name + '</option>';
                        }
                        html += '</option>';
                        $('#activities').html(html);
                    }
                );
            }
        );
   </script>
`

- activities  is id of <form:select> spring tag
`<td><form:select id="activities" path="activity"/></td>`
