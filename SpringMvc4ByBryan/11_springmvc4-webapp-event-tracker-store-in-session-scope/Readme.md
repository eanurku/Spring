1. maven dependencies:
   -spring-boot-starter-parent: 1.0.2.RELEASE
   -spring-boot-starter-web
   -spring-boot-starter-test

`    <properties>
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.0.2.RELEASE</version>
        <relativePath/>
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>
    </dependencies>`

2. store object in session scope
-using @SessionAttributes annotation
` @SessionAttributes("event")`
-event is the attribute in Model UI Object
-any number of Model attribute can be stored in session scope
   ` @SessionAttributes({"event","goal","item"})`
`
@Controller
@SessionAttributes("event")
public class EventController {
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public String displayEventPage(Model model) {
        Event event = new Event();
        event.setEventName("Java User Group Event");
        model.addAttribute("event", event);
        return "event";
    }
    @RequestMapping(value = "/event",method = RequestMethod.POST)
    public String submitEvent(@ModelAttribute("event") Event event){
        System.out.println(event);
        return "redirect:index";
    }
}
`