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

    @GetMapping("/{studentID}")
    public Optional<StudentModel> getStudentById(@PathVariable("studentID") int studentID){
        return studentDAO.findById(studentID);
    }
    @GetMapping("/findByName/{studentName}")
    public Optional<StudentModel> findByStudentName(@PathVariable("studentName") String studentName){
        return studentDAO.findByStudentName(studentName);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAllStudents(){
         studentDAO.deleteAll();
    }

    @GetMapping("/findByNameAndID/{studentName},{studentId}")
    public Optional<StudentModel> findByStudentNameAndStudentId(@PathVariable("studentName") String studentName,@PathVariable("studentId") int studentId){
        return studentDAO.findByStudentNameAndStudentId(studentName,studentId);
    }

    @GetMapping("/findByNameAndOrderByID/{studentName}")
    public Optional<StudentModel> findByStudentNameOrderByStudentIdDesc(@PathVariable("studentName") String studentName){
        return studentDAO.findByStudentNameOrderByStudentIdDesc(studentName);
    }

}
