package com.quest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.quest.model.Student;
import com.quest.repository.StudentRepository;

@Component
public class StudentDaoImpl {

	@Autowired
	
	StudentRepository  studentRepoImpl;
	
	public List<Student> getAllData()
	{
		return (List<Student>) studentRepoImpl.findAll();
	}
	public Optional<Student> getDataById(@PathVariable int id)
	{
		return  studentRepoImpl.findById(id);
	}
	public void saveData(Student student)
	{
		 studentRepoImpl.save(student);
    }
	public void updateData(int id,Student student)
	{
		 studentRepoImpl.save(student);
	}
	public void deleteData(int id)
	{
		 studentRepoImpl.deleteById(id);
	}		
	
	
}
