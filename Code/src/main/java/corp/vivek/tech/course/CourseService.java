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
    private List<Courses> coursesList = Arrays.asList(
            new Courses("java", "Java Course", "java description"),
            new Courses("python", "Python Course", "python description"),
            new Courses("ruby", "Ruby Course", "ruby description")
    );

    public List<Courses> getAllCourses() {
        return coursesList;
    }

    public Courses getCourse(String id) {
        return coursesList.stream().filter(course -> course.getId().equals(id)).findFirst().get();

//        for(Courses course: coursesList) {
//            if (course.getId().equals(id)) {
//                return course;
//            }
//        }
//
//        return null;
    }
}
