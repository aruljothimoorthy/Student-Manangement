package com.example.demowithstudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demowithstudent.deo.StudentResp;
import com.example.demowithstudent.model.*;


@Service
public class StudentService {
	@Autowired
	StudentResp ob;
	
	
	//save
	public void savefile(Student s) // rose bca
	
	{
		ob.save(s); //repository-----save
	}
	
	//full ah select
	public List<Student> get()
	
	{
		return ob.findAll(); // rose,bca
	}

}