package com.school.convent.DAO;

import com.school.convent.Model.BookModel;
import com.school.convent.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookDAO extends CrudRepository<BookModel,Integer> {

     public BookModel findByBookName(String bookName);



}
