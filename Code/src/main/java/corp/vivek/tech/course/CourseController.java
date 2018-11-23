/**
 *
 */
package corp.vivek.tech.course;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Vivek Vellaiyappan | vivekvellaiyappans@gmail.com
 */
@RestController
public class CourseController {

    /**
     * getCourses method to return all possible courses available
     *
     * @return list of courselist objects
     */
    @RequestMapping("/courses")
    public List<Courses> getCourses() {
        // Spring MVC converts Courses Objects List into JSON automatically and returns JSON response
        // The generated JSON has key names corresponding to the property names of the Courses class.
        //  The JSON values are the values of those properties.
        List<Courses> coursesList = Arrays.asList(
                new Courses("java", "Java Course", "java description"),
                new Courses("python", "Python Course", "python description"),
                new Courses("ruby", "Ruby Course", "ruby description")
        );

        return coursesList;
    }
}

/*
Output:
> In web page when navigated to http://localhost:8080/courses
[
  {
    "id": "java",
    "name": "Java Course",
    "description": "java description"
  },
  {
    "id": "python",
    "name": "Python Course",
    "description": "python description"
  },
  {
    "id": "ruby",
    "name": "Ruby Course",
    "description": "ruby description"
  }
]
<

> In Console Log:
2018-11-23 18:51:43.518  INFO 2796 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-11-23 18:51:43.549  INFO 2796 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-11-23 18:51:43.549  INFO 2796 --- [           main] corp.vivek.tech.CourseApp                : Started CourseApp in 3.567 seconds (JVM running for 5.091)
<
 */
