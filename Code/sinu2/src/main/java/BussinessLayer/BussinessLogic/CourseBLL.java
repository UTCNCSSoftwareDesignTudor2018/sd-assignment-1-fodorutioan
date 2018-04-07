package BussinessLayer.BussinessLogic;

import BussinessLayer.Validators.IDValidator;
import PersistanceLayer.DAOs.CourseDAO;
import PersistanceLayer.Entities.Course;

import java.util.LinkedList;

/**
 * Created by Ioan on 3/27/2018.
 */
public class CourseBLL {

    public LinkedList<Course> selectCoursesNotTakenBy(Long studentID) {
        IDValidator idValidator = new IDValidator();
        if (idValidator.validate(studentID)) {
            CourseDAO courseDAO = new CourseDAO();
            LinkedList<Course> courses = courseDAO.selectCoursesNotTaken(studentID);
            return courses;
        } else {
            return null;
        }
    }
}
