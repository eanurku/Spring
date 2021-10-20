1.controller is returning directly the view name:

`@Controller
public class HelloController {

    @RequestMapping("/greeting")
    public String welcome(Model model) {

        model.addAttribute("greeting","Welcome to Mvc 4");
        return "welcome.jsp";
    }

}`

2. view name files available in webapp or root folder.
-webapp
 -welcome.jsp
 -index.jsp