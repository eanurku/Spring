1. add hibernate-validator dependency:
`   
   <dependency>
   <groupId>org.hibernate</groupId>
   <artifactId>hibernate-validator</artifactId>
   <version>4.2.0.Final</version>
   </dependency>
`
2. add @valid ,BindingResult in controller method
`  
   @RequestMapping(value = "/addGoal",method = RequestMethod.POST)
   public String submitGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){

        System.out.println("result:"+result);
        if(result.hasErrors()){
            return "addGoal";
        }
        System.out.println("goal:"+goal);
        return "redirect:addMinutes";
   }
`
3. use spring <form:errors> tag 
- add <form:errors> for all fields in Goal Object
`  <form:errors path="*" cssClass="commonErrorBlock" element="div"/>`
- add  <form:errors> for specific field in Goal Object
`<td><form:errors path="minutes" cssClass="error"/></td>`
- use  cssErrorClass of <form:input> to show effect if error happens.
` <td><form:input path="minutes" cssErrorClass="errorBox"/></td>`

- form example:

`<form:form commandName="goal">
    <form:errors path="*" cssClass="commonErrorBlock" element="div"/>
    <table>
        <tr>
            <td>Enter today Goal:</td>
            <td><form:input path="minutes" cssErrorClass="errorBox"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter">
            </td>
        </tr>
    </table>
</form:form>`

4. add custom message in messages properties files for @Range validation over goal object
-messages.properties
 -Range.goal.minutes=Goal must be between {2} and  {1}