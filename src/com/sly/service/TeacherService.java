package com.sly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sly.bean.Teacher;
import com.sly.dao.TeacherDao;

@Service
public class TeacherService {
	
	//@Autowired
	//private SqlSessionFactory sqlSessionFactoryBean;
	
	@Autowired
	private TeacherDao teacherDao;
	

	public Teacher getTeacher(Integer id) {
		return teacherDao.getTeacherById(id);
	}


	public List<Teacher> getAll() {

		return teacherDao.getTeachers();
	}
	
}
