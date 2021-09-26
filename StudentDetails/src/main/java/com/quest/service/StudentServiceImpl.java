package com.quest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.quest.dao.StudentDaoImpl;
import com.quest.model.Student;

@Service
public class StudentServiceImpl {
	
	@Autowired
	
	StudentDaoImpl studentDaoImpl;
	
	public List<Student> getAllData()
	{
		return (List<Student>) studentDaoImpl.getAllData();
	}
	public Optional<Student> getDataById(@PathVariable int id)
	{
		return studentDaoImpl.getDataById(id);
	}
	public void saveData(Student student)
	{
		studentDaoImpl.saveData(student);
    }
	public void updateData(int id,Student student)
	{
		studentDaoImpl.saveData(student);
	}
	public void deleteData(int id)
	{
		studentDaoImpl.deleteData(id);
	}		

}
