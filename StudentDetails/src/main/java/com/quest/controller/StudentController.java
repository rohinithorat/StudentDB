package com.quest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quest.model.Student;
import com.quest.service.StudentServiceImpl;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("students")
	public List<Student> getAllData()
	{
		return studentServiceImpl.getAllData();
	}
	
	@GetMapping("students/{id}")
	public Optional<Student> getDataById(@PathVariable int id)
	{
		return studentServiceImpl.getDataById(id);
	}
	
	@PostMapping("students")
	public String saveData(@RequestBody Student student)
	{
		studentServiceImpl.saveData(student);
		return "Student data saved successfully!";
	}
	@PutMapping("students/{id}")
	public String updateData(@PathVariable int id,@RequestBody Student student)
	{
		studentServiceImpl.saveData(student);
		return "Student data updated successfully!";
	}
	@DeleteMapping("students/{id}")
	public String deletedata(@PathVariable int id)
	{
		studentServiceImpl.deleteData(id);
		return "Student Data deleted successfully!";
	}


}
