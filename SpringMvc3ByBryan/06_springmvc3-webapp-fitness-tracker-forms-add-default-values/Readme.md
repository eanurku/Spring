1. spring 3.2.0.RELEASE will be compatible with  jdk7 but not with later version like jdk8,jdk9,...
   `<properties>
   <maven.compiler.source>1.7</maven.compiler.source>
   <maven.compiler.target>1.7</maven.compiler.target>
   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
   </properties>`
2. use jdk 1.7 to create war.

3. goal attribute present in Model Object is passed to form with commandName=goal

`   
   @RequestMapping(value = "/addGoal",method = RequestMethod.GET)
   public String addGoal(Model model){
   Goal goal=new Goal();
   goal.setMinutes(100);//setting default value for form
   model.addAttribute("goal",goal);
   return "addGoal";
   }

`