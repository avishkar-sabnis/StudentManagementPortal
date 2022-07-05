package com.school.convent.Service;

import com.school.convent.DAO.StudentDAO;
import com.school.convent.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {



    @Autowired
    StudentDAO studentDAO;

    public StudentModel createStudent(StudentModel studentModel){
        return studentDAO.save(studentModel);
    }

    public Optional<StudentModel> findByStudentName(String studentName){
        return studentDAO.findByStudentName(studentName);
    }

    public Optional<StudentModel> findByStudentNameAndStudentId(String studentName,int studentId){
        return studentDAO.findByStudentNameAndStudentId(studentName,studentId);
    }

    public Optional<StudentModel> findByStudentNameOrderByStudentIdDesc(String studentName){
        System.out.print(studentName);
        return studentDAO.findByStudentNameOrderByStudentIdDesc(studentName);

    }


    public void deleteById(){
        studentDAO.deleteAll();
    }
}
