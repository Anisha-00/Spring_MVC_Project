package com.cnts.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cnts.entities.NewStudentEntity;

@Repository
@Transactional
public class NewStudentRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void saveNewStudent(NewStudentEntity entity) {
		hibernateTemplate.save(entity);
	}
	
	public List<NewStudentEntity> fetchAll(){
		return null;
	}
}
