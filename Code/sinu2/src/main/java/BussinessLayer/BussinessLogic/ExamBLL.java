package BussinessLayer.BussinessLogic;

import BussinessLayer.Validators.IDValidator;
import PersistanceLayer.DAOs.ExamDAO;
import PersistanceLayer.Entities.Course;
import PersistanceLayer.Entities.Exam;

import java.util.LinkedList;

/**
 * Created by Ioan on 3/27/2018.
 */
public class ExamBLL {
    public LinkedList<Exam> selectExamsNotTakenBy(Long studentID) {
        IDValidator idValidator = new IDValidator();
        if (idValidator.validate(studentID)) {
            ExamDAO examDAO = new ExamDAO();
            return examDAO.selectExamsNotRegistered(studentID);
        } else {
            return null;
        }
    }

}
