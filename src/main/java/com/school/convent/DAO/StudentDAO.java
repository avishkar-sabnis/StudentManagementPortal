package com.school.convent.DAO;

import com.school.convent.Model.StudentModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentDAO extends CrudRepository<StudentModel,Integer> {
    Optional<StudentModel> findById(int studentID);
    Optional<StudentModel> findByStudentName(String studentName);



    void deleteAll();

 /*   Optional<StudentModel> findByStudentNameAndStudentId(String studentName, int studentId);

    Optional<StudentModel> findByStudentNameOrderByStudentIdDesc(String studentName);
*/
   // Optional<StudentModel> fetchStudentWithName(String studentName);

  //  public Iterable<StudentModel> findListStudents(StudentModel studentName);


    @Query(value = "SELECT *from schoolmanagement.school_management  where student_name=?1",nativeQuery = true)
    Optional<StudentModel> findfirstName(String studentName);


}
