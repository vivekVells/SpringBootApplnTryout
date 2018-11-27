/**
 *
 */
package corp.vivek.tech.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
// This is the business service contract being made. Using service singleton instance dependency injection,'
//  need to create new values again and again is avoided. only one instance is enough to manage
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // ArrayList is mutable
    // Arrays.asList is immutable
//    private List<Courses> coursesList = new ArrayList<>(
//            Arrays.asList(
//                    new Courses("java", "Java Course", "java description"),
//                    new Courses("python", "Python Course", "python description"),
//                    new Courses("ruby", "Ruby Course", "ruby description")
//            )
//    );

    public List<Courses> getAllCourses() {
        List<Courses> coursesList = new ArrayList<>();

        // return coursesList;
        // courseRepository.findAll() returns all possible values in the table
        //  Courses table values being returned since courseRepository is instance of
        //   CourseRepository(Courses, String) where Courses is the Entity class & String is the primary key
        // courseRepository.findAll().forEach(coursesList::add);
        courseRepository.findAll().forEach(course -> coursesList.add(course));

        return coursesList;
    }

    public Courses getCourse(String id) {
        // return coursesList.stream().filter(course -> course.getId().equals(id)).findFirst().get();
        // return courseRepository.findById(id);

        return courseRepository.findById(id).get();

//        for(Courses course: coursesList) {
//            if (course.getId().equals(id)) {
//                return course;
//            }
//        }
//
//        return null;
    }

    /**
     * To add new course
     *
     * @param course
     */
    public void addCourse(Courses course) {
        courseRepository.save(course);
    }
}
