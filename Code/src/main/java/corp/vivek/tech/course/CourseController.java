/**
 *
 */
package corp.vivek.tech.course;

import org.springframework.beans.factory.annotation.Autowired;
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

    // Autowired helps to identify the service that needs dependency injection
    //  CouseService instance is created which is a singleton instance created only once & shared
    //  To avoid creating new instance of course list everytime, service is being used
    @Autowired
    private CourseService courseService;

    /**
     * getCourses method to return all possible courses available
     *
     * @return list of courselist objects
     */
    @RequestMapping("/courses")
    public List<Courses> getAllCourses() {
        // Spring MVC converts Courses Objects List into JSON automatically and returns JSON response
        // The generated JSON has key names corresponding to the property names of the Courses class.
        //  The JSON values are the values of those properties.
        List<Courses> coursesList = courseService.getAllCourses();

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
2018-11-24 17:53:41.346  INFO 2192 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
2018-11-24 17:53:41.346  INFO 2192 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
2018-11-24 17:53:41.369  INFO 2192 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 23 ms
<
 */
