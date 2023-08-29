package com;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class EmpDaoImp implements EmpDAO{
	JdbcTemplate jbt;
	@Autowired
	public EmpDaoImp(DataSource datasource) {
		jbt=new JdbcTemplate(datasource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return jbt.query("select * from rjpro",new EmpMap());
	}

}
