package com.cnts.service;

import java.util.List;

import com.cnts.bean.NewStudent;

public interface NewStudentService {

	public void save(NewStudent newStudent);
	
	public List<NewStudent> fetchAll();
}
