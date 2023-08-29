package com;

public class Employee {
	int empno;
	String ename;
	String job;
	int dept;
	double sal;
	public Employee() {
		
	}
	public Employee(int empno, String ename, String job, int dept, double sal) {
		
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.dept = dept;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
