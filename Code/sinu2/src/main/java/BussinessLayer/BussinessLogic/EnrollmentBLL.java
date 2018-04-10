package BussinessLayer.BussinessLogic;

import BussinessLayer.Validators.IDValidator;
import BussinessLayer.Validators.NameValidator;
import PersistanceLayer.DAOs.EnrollmentDAO;
import PersistanceLayer.Entities.Enrollment;

import java.util.LinkedList;

public class EnrollmentBLL {

    public boolean enrollStudentToCourse(Long studentID, Long courseID) {
        //System.out.println(courseName);
        IDValidator idValidator = new IDValidator();
        if (idValidator.validate(studentID) && idValidator.validate(courseID)) {
            EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
            if (enrollmentDAO.insert(studentID, courseID)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public LinkedList<Enrollment> selectByStudentID(Long studentID) {
        IDValidator idValidator = new IDValidator();
        if (idValidator.validate(studentID)) {
            EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
            return enrollmentDAO.selectByStudentID(studentID);
        } else {
            return null;
        }
    }

}
