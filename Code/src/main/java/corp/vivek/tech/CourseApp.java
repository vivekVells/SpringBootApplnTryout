package corp.vivek.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
// This assures that this is the starting point of the spring boot application and helps to start this application
@SpringBootApplication
public class CourseApp {
    public static void main(String[] args) {
        // run static method in SpringApplication helps to achieve the following
        //   create servlet container; host this application inside the servlet container
        //     by default, tomcat server is being started and this acts as a stand alone web application
        SpringApplication.run(CourseApp.class, args);
    }
}

/*
Output:

When navigated to http://localhost:8080/
>
Whitelabel Error Page

This application has no explicit mapping for /error, so you are seeing this as a fallback.
Fri Nov 23 17:26:14 EST 2018
There was an unexpected error (type=Not Found, status=404).
No message available
<

LOG:
>
2018-11-23 17:23:49.142  INFO 12884 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-11-23 17:23:49.258  INFO 12884 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-11-23 17:23:49.296  INFO 12884 --- [           main] corp.vivek.tech.CourseApp                : Started CourseApp in 4.705 seconds (JVM running for 6.317)
<
 */