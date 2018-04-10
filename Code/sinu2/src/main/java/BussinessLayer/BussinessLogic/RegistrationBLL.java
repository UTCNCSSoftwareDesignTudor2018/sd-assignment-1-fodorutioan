package BussinessLayer.BussinessLogic;

import BussinessLayer.Validators.IDValidator;
import PersistanceLayer.DAOs.RegistrationDAO;
import PersistanceLayer.Entities.Registration;

import java.util.LinkedList;

public class RegistrationBLL {

    public LinkedList<Registration> selectByStudentID(Long studentID) {
        IDValidator idValidator = new IDValidator();
        if (idValidator.validate(studentID)) {
            RegistrationDAO registrationDAO = new RegistrationDAO();
            return registrationDAO.selectByStudentID(studentID);
        } else {
            return null;
        }
    }

    public boolean registerStudentForExam(Long studentID, Long examID) {
        IDValidator idValidator = new IDValidator();
        if (idValidator.validate(studentID)) {
            RegistrationDAO registrationDAO = new RegistrationDAO();
            if (registrationDAO.insert(studentID, examID)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
