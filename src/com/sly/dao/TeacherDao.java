package com.sly.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sly.bean.Teacher;

public interface TeacherDao {
	
	public Teacher getTeacherById(Integer id);
	public List<Teacher> getTeachers();

}
