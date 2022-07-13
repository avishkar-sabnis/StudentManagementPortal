package com.school.convent.Controller;


import com.school.convent.DAO.BookDAO;
import com.school.convent.DAO.StudentDAO;
import com.school.convent.Model.BookModel;
import com.school.convent.Model.StudentModel;
import com.school.convent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/school")
public class StudentController {

    @Autowired
    StudentService studentService;



    @Autowired
    StudentDAO studentDAO;

    @Autowired
    BookDAO bookDAO;

    @PostMapping("/createStudent")
    public StudentModel createStudent(@RequestBody StudentModel studentModel){
        return studentService.createStudent(studentModel);
    }

    @GetMapping("/studentList")
    public Iterable<StudentModel> findListStudents(StudentModel studentModel){
        return studentService.findListStudents(studentModel);
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
    public Optional<StudentModel> fetchStudentWithName(@PathVariable("studentName") String studentName){
        return studentDAO.fetchStudentWithName(studentName);
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

    @PostMapping("/createBooks")
    public BookModel saveAllBooks(@RequestBody BookModel bookModel){
        return bookDAO.save(bookModel);
    }


    @GetMapping("/getAllBooks")
    public Iterable<BookModel> getAllBooks(){
        return studentService.getAllBooks();
    }

    @GetMapping("/findByName/bookName")
    public BookModel findByBookName(@PathVariable("bookName") String bookName){
        return studentService.findByBookName(bookName);
    }




}
