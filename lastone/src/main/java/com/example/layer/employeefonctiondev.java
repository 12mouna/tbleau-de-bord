package com.example.layer;
import com.example.model.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employerrow;

@Transactional
@Repository
public class employeefonctiondev implements Employefonction {

	@Autowired
	 private JdbcTemplate jdbcTemplate;

	 @Override
	 public List<employee> getAllemployees() {
	  String query = "SELECT * from employees";
	  RowMapper<employee> rowMapper = new Employerrow();
	  List<employee> list = jdbcTemplate.query(query, rowMapper);
	  
	  return list;
	 }

	 @Override
	 public employee findeemployeeById(int id) {
	  String query = "SELECT * FROM employees WHERE employee_id = ?";
	  RowMapper<employee> rowMapper = new BeanPropertyRowMapper<employee>(employee.class);
	  employee employee =jdbcTemplate.queryForObject(query, rowMapper, id);
	  
	  return employee;
	 }

	 @Override
	 public void addemployee(employee employee) {
	  String query = "INSERT INTO employees(employee_id, first_name, last_name, email, password, job_title) VALUES(?, ?, ?, ?, ?, ?)";
	  jdbcTemplate.update(query, employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPassword(), employee.getJobTitle());
	  
	 }

	 @Override
	 public void updateemployee(employee employee) {
	  String query = "UPDATE employees SET first_name=?, last_name=?, email=?, password=?, job_title=? WHERE employee_id=?";
	  jdbcTemplate.update(query, employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getPassword(), employee.getJobTitle(), employee.getEmployeeId());
	  
	 }
	 @Override
	 public void deleteemployee(int id) {
	  String query = "DELETE FROM employees WHERE employee_id=?";
	  jdbcTemplate.update(query, id);
	 }

}
