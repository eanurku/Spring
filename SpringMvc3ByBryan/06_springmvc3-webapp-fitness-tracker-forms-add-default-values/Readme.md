1.goal attribute present in Model Object is passed to form with commandName=goal

`   
   @RequestMapping(value = "/addGoal",method = RequestMethod.GET)
   public String addGoal(Model model){
   Goal goal=new Goal();
   goal.setMinutes(100);
   model.addAttribute("goal",goal);
   return "addGoal";
   }

`