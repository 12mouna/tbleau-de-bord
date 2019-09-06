package com.example.service;

import com.example.layer.Employefonction;
import com.example.model.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Emploeeservimp implements Employeeservice  {

	 @Autowired
	 private Employefonction employeeDao;

	 @Override
	 public List<employee> getAllemployees() {
	  return employeeDao.getAllemployees();
	 }

	 @Override
	 public employee findeemployeeById(int id) {
	  return employeeDao.findeemployeeById(id);
	 }

	 @Override
	 public void addemployee(employee employee) {
	  employeeDao.addemployee(employee);
	 }

	 @Override
	 public void updateemployee(employee employee) {
	  employeeDao.updateemployee(employee);
	 }

	 @Override
	 public void deleteemployee(int id) {
	  employeeDao.deleteemployee(id);
	 }

}
