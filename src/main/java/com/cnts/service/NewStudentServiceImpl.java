package com.cnts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnts.bean.NewStudent;
import com.cnts.entities.NewStudentEntity;
import com.cnts.repository.NewStudentRepository;

@Service
public class NewStudentServiceImpl implements NewStudentService{

	@Autowired
	private NewStudentRepository newStudentRepository;
	@Override
	public void save(NewStudent newStudent) {
		NewStudentEntity entity = beanToEntity(newStudent);
		newStudentRepository.saveNewStudent(entity);
	}

	@Override
	public List<NewStudent> fetchAll() {
		
		return null;
	}

	//conversion entity to bean and visa versa
	public NewStudent entityToBean(NewStudentEntity entity) {
		NewStudent student = new NewStudent();
		
		student.setAdmissionNo(entity.getAdmissionNo());
		student.setStudentName(entity.getStudentName());
		student.setDob(entity.getDob());
		student.setFatherName(entity.getFatherName());
		student.setMotherName(entity.getMotherName());
		student.setFatherOccupation(entity.getFatherOccupation());
		student.setMotherOccupation(entity.getMotherOccupation());
		student.setAddress(entity.getAddress());
		student.setPhoneNumber(entity.getPhoneNumber());
		student.setNationality(entity.getNationality());
		student.setClassAdmissionFor(entity.getClassAdmissionFor());
		
		return student;
	}
	
	public NewStudentEntity beanToEntity(NewStudent student) {
		NewStudentEntity entity = new NewStudentEntity();
		
		entity.setAdmissionNo(student.getAdmissionNo());
		entity.setStudentName(student.getStudentName());
		entity.setDob(student.getDob());
		entity.setFatherName(student.getFatherName());
		entity.setMotherName(student.getMotherName());
		entity.setFatherOccupation(student.getFatherOccupation());
		entity.setMotherOccupation(student.getMotherOccupation());
		entity.setAddress(student.getAddress());
		entity.setPhoneNumber(student.getPhoneNumber());
		entity.setNationality(student.getNationality());
		entity.setClassAdmissionFor(student.getClassAdmissionFor());
		
		return entity;
	}
}
