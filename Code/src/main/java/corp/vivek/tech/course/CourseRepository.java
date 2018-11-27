/**
 *
 */
package corp.vivek.tech.course;

import org.springframework.data.repository.CrudRepository;

/**
 *
 */
// to have a hub kind of thing to handle all crud operations for this appln feature
// interface being created to extend CrudRepository interface since CRUD methods are being declared on
//  CrudRepository interface which makes a contract here with CourseRepository to implement the required methods
//  CrudRepository<Courses, String> being done such that
    // Courses refers to the Entity
    // String refers to the primary key
// Spring data JPA is going to provide the class for this interface so that implementation from that calss will be used
//  by the interface
public interface CourseRepository extends CrudRepository<Courses, String> { }
