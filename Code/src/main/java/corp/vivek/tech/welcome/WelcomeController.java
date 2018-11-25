package corp.vivek.tech.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring MVC implementation
 *
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */

/**
 *
 */
// making this class to be RESTful services by using annotation, RestController
//  Web layer in Spring boot usings Spring framework called Spring MVC, child project of Spring Framework
//  lets you build server side code that maps url args with class and provide responses which is then handled
@RestController
public class WelcomeController {

    /**
     * Default url mapping
     * Note that there is no () in @RequestMapping
     */
    @RequestMapping
    public String welcomeMsg() {
        return welcome();
    }

    /**
     * Welcome class to display a welcome message
     *
     * @return welcome string message
     */
    // @RestController to make the class use Spring MVC
    // @RequestMapping helps to map the url args using http methods (get, post, put, update, delete) to get the class's response and display in the web
    @RequestMapping("/welcome")
    public String welcome() {
        return "Hello Spring Boot World! Looking forward to do amazing things with you! yours, Vivek";
    }
}

/*
Output:
>
In web appln -> navigated to http://localhost:8080
Hello Spring Boot World! Looking forward to do amazing things with you! yours, Vivek
<

>
In console log
2018-11-24 19:27:55.145  INFO 14196 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-11-24 19:27:55.198  INFO 14196 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-11-24 19:27:55.198  INFO 14196 --- [           main] corp.vivek.tech.CourseApp                : Started CourseApp in 3.968 seconds (JVM running for 5.859)
2018-11-24 19:27:55.276  INFO 14196 --- [nio-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2018-11-24 19:27:55.276  INFO 14196 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2018-11-24 19:27:55.298  INFO 14196 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 22 ms
<
 */