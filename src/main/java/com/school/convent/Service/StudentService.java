package com.school.convent.Service;

import com.school.convent.DAO.BookDAO;
import com.school.convent.DAO.StudentDAO;
import com.school.convent.Model.BookModel;
import com.school.convent.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {



    @Autowired
    StudentDAO studentDAO;

    @Autowired
    BookDAO bookDAO;



    public StudentModel createStudent(StudentModel studentModel){
        return studentDAO.save(studentModel);
    }

    public Optional<StudentModel> findByStudentName(String studentName){
        return studentDAO.findByStudentName(studentName);
    }

    public Optional<StudentModel> findByStudentNameAndStudentId(String studentName,int studentId){
        return studentDAO.findByStudentNameAndStudentId(studentName,studentId);
    }

    public Iterable<StudentModel> findListStudents(StudentModel studentModel){
        return studentDAO.findListStudents(studentModel);
    }

    public Optional<StudentModel> findByStudentNameOrderByStudentIdDesc(String studentName){
        System.out.print(studentName);
        return studentDAO.findByStudentNameOrderByStudentIdDesc(studentName);

    }

    public Optional<StudentModel> fetchStudentWithName(String studentName){
        System.out.print(studentName);
        return studentDAO.fetchStudentWithName(studentName);

    }


    public void deleteById(){
        studentDAO.deleteAll();
    }


    //ManyToMany

    public BookModel findByBookName(String bookName){
        return bookDAO.findByBookName(bookName);
    }
    public BookModel saveAllBooks(BookModel bookModel){
        return bookDAO.save(bookModel);
    }

    public Iterable<BookModel> getAllBooks(){
        return bookDAO.findAll();
    }

}
