/**
 *
 */
package corp.vivek.tech.course;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
// This is the business service contract being made. Using service singleton instance dependency injection,'
//  need to create new values again and again is avoided. only one instance is enough to manage
@Service
public class CourseService {
    public List<Courses> getAllCourses() {
        List<Courses> coursesList = Arrays.asList(
                new Courses("java", "Java Course", "java description"),
                new Courses("python", "Python Course", "python description"),
                new Courses("ruby", "Ruby Course", "ruby description")
        );

        return coursesList;
    }
}
