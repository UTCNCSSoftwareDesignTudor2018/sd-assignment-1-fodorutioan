package PersistanceLayer.DAOs;

import PersistanceLayer.DTOs.StudentDTO;

/**
 * Created by Ioan on 3/27/2018.
 */
public class StudentDAO {
    public StudentDTO getStudent(String CNP) {
        StudentDTO s = new StudentDTO();
        s.setCNP(CNP);
        return s;
    }
}
