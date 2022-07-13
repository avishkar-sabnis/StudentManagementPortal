package com.school.convent.DAO;

import com.school.convent.Model.PublisherModel;
import com.school.convent.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherDAO extends CrudRepository<PublisherModel,Integer> {
}
