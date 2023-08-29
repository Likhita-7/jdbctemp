package com;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class DaL {
	EmpDAO dao;
	@Autowired
	public DaL(EmpDAO dao) {
		this.dao=dao;
	}
	@RequestMapping(value = "/emplist", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("Employee List jsp requested");
		List<Employee> empList = dao.getAllEmployees();
		for(Employee e:empList)
		System.out.println(e.getEmpno());
		model.addAttribute("elist",empList);
		return "emplist";
	}

}
