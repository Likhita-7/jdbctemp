package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpMap implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setEmpno(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setJob(rs.getString(3));
		emp.setDept(rs.getInt(4));
		emp.setSal(rs.getDouble(5));
		return emp;
	}

}
