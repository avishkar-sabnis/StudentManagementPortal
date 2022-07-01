package com.school.convent.Controller;


import com.school.convent.DAO.StudentDAO;
import com.school.convent.Model.StudentModel;
import com.school.convent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/school")
public class StudentController {

    @Autowired
    StudentService studentService;



    @Autowired
    StudentDAO studentDAO;

    @PostMapping("/createStudent")
    public StudentModel createStudent(@RequestBody StudentModel studentModel){
        return studentService.createStudent(studentModel);
    }

    @GetMapping("/studentDetails")
    public Iterable<StudentModel> getStudentDetails(StudentModel studentModel){
        return studentDAO.findAll();
    }

    @GetMapping("/{StudentID}")
    public Optional<StudentModel> getStudentById(@PathVariable("StudentID") int StudentID){
        return studentDAO.findById(StudentID);
    }

}
