package BussinessLayer.BussinessLogic;

import BussinessLayer.Validators.*;
import PersistanceLayer.DAOs.StudentDAO;
import PersistanceLayer.Entities.Student;

import java.sql.SQLOutput;
import java.util.LinkedList;

/**
 * Created by Ioan on 3/27/2018.
 */
public class StudentBLL {

    private StudentDAO studentDAO;

    private LogInValidator logInValidator;
    private NameValidator nameValidator;
    private IDValidator idValidator;
    private GroupValidator groupValidator;
    private EmailValidator emailValidator;
    private AddressValidator addressValidator;
    private CNPValidator cnpValidator;

    public StudentBLL() {
        studentDAO = new StudentDAO();
    }

    public Student logIn(String username, String password) {
        Student student = studentDAO.selectStudentByUserName(username);
        logInValidator = new LogInValidator();
        if (logInValidator.validateStudentLogIn(student, password)) {
            return student;
        } else {
            return null;
        }
    }

    public boolean update(String name, String address, String CNP, String email, String group, Long ID) {

        nameValidator = new NameValidator();
        idValidator = new IDValidator();
        groupValidator = new GroupValidator();
        emailValidator = new EmailValidator();
        addressValidator = new AddressValidator();
        cnpValidator = new CNPValidator();

        if (nameValidator.validate(name) &&
                idValidator.validate(ID) &&
                groupValidator.validate(group) &&
                emailValidator.validate(email) &&
                addressValidator.validate(address) &&
                cnpValidator.validate(CNP)) {

                if (studentDAO.update(name, address, CNP, email, group, ID)) {
                    return true;
                }

        } else {
            System.out.println("Invalid data!");
            return false;
        }

        return false;
    }

    public LinkedList<Student> selectAll() {
        return studentDAO.selectAll();
    }

    public Student selectStudentByID(Long studentID) {
        idValidator = new IDValidator();

        if (idValidator.validate(studentID)) {
            return studentDAO.selectStudentByID(studentID);
        } else {
            System.out.println("Invalid data!");
            return null;
        }
    }

}
