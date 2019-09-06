package com.example.layer;

import java.util.List;

import com.example.model.employee;

public interface Employefonction {
	public List<employee> getAllemployees();
	 
	 public employee findeemployeeById(int id);
	 
	 public void addemployee(employee employee);
	 
	 public void updateemployee(employee employee);
	 
	 public void deleteemployee(int id);

}
