package com.school.convent.Service;

import com.school.convent.DAO.StudentDAO;
import com.school.convent.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {



    @Autowired
    StudentDAO studentDAO;

    public StudentModel createStudent(StudentModel studentModel){
        return studentDAO.save(studentModel);
    }
}
