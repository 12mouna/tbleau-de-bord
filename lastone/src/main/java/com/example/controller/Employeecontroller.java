package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.employee;

import com.example.service.Emploeeservimp;

@Controller
@RequestMapping("/employee")
public class Employeecontroller {

	 @Autowired
	 private Emploeeservimp employeeService;
	 
	 @RequestMapping(value= {"/", "/list"}, method=RequestMethod.GET)
	 public ModelAndView getAllEmployees() {
	  ModelAndView model = new ModelAndView();
	  List<employee> list = employeeService.getAllemployees();
	  
	  model.addObject("employee_list", list);
	  model.setViewName("employee_list");
	  return model;
	 }
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	 public ModelAndView editEmployee(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  employee employee = employeeService.findeemployeeById(id);
	  model.addObject("employeeForm", employee);
	  
	  model.setViewName("employee_form");
	  return model;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.GET)
	 public ModelAndView addEmployee() {
	  ModelAndView model = new ModelAndView();
	  
	  employee employee = new employee();
	  model.addObject("employeeForm", employee);
	  
	  model.setViewName("employee_form");
	  return model;
	 }
	 
	 @RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView saveOrUpdate(@ModelAttribute("employeeForm") employee employee) {
	  if(employee.getEmployeeId() != null) {
	   employeeService.updateemployee(employee);
	  } else {
	   employeeService.addemployee(employee);
	  }
	  return new ModelAndView("redirect:/employee/list");
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	 public ModelAndView deleteEmployee(@PathVariable("id") int id) {
	  employeeService.deleteemployee(id);
	  
	  return new ModelAndView("redirect:/employee/list");
	 }

}
