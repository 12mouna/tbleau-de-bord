package com.example.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Employerrow  implements RowMapper<employee>{

	 @Override
	 public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	  employee employee = new employee();
	  employee.setEmployeeId(rs.getInt("employee_id"));
	  employee.setFirstName(rs.getString("first_name"));
	  employee.setLastName(rs.getString("last_name"));
	  employee.setEmail(rs.getString("email"));
	  employee.setPassword(rs.getString("password"));
	  employee.setJobTitle(rs.getString("job_title"));
	  return employee;
	 }
}
