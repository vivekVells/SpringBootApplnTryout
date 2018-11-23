package corp.vivek.tech;

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
public class welcome {

    /**
     * Welcome class to display a welcome message
     *
     * @return welcome string message
     */
    // Request Mapping helps to map url arg with the class.
    //  By default, it takes get http method; can add any types of http method to handle (get, post, put, delete, etc)
    @RequestMapping("/welcome")
    public String welcome() {
        return "Hello Spring Boot World! Looking forward to do amazing things with you! yours, keviv";
    }
}

/*
Output:
>
In web appln -> navigated to http://localhost:8080/welcome
Hello Spring Boot World! Looking forward to do amazing things with you! yours, keviv
<

>
In console log
2018-11-23 18:14:45.457  INFO 8456 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2018-11-23 18:14:45.457  INFO 8456 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2018-11-23 18:14:45.488  INFO 8456 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 31 ms
<
 */