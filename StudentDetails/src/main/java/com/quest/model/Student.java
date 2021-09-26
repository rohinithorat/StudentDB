package com.quest.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Student {
	
	   @Id
	   @GeneratedValue
	
	private int Student_Id;
	
	private String Student_Name;
	
	private String Email_Id;
	
	@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
	private Date BookIssue_Date;
	
	@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
	private Date BookReturn_Date;
	
	
	//-------------------------------------

}
