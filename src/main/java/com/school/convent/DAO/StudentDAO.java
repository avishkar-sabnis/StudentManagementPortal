package com.school.convent.DAO;

import com.school.convent.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentDAO extends CrudRepository<StudentModel,Integer> {
    Optional<StudentModel> findById(int studentID);
    Optional<StudentModel> findByStudentName(String studentName);



    void deleteAll();

    Optional<StudentModel> findByStudentNameAndStudentId(String studentName, int studentId);

    Optional<StudentModel> findByStudentNameOrderByStudentIdDesc(String studentName);
}
