package BussinessLayer.Validators;

import PersistanceLayer.Entities.Student;
import PersistanceLayer.Entities.Teacher;

public class LogInValidator {

    public boolean validateStudentLogIn(Student student, String password) {
        if (student == null) {
            return false;
        }

        if (!student.getPassword().equals(password)) {
            return false;
        }

        return true;
    }

    public boolean validateTeacherLogIn(Teacher teacher, String password) {
        if (teacher == null) {
            return false;
        }

        if (!teacher.getPassword().equals(password)) {
            return false;
        }

        return true;
    }


}
