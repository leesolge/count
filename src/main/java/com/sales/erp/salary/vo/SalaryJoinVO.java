package com.sales.erp.salary.vo;

public class SalaryJoinVO {
	private String team;
	private String name;
	private String auth;
	private String empno;
	private String salarydate;
	private long salary;
	private long allowance;
	private long manager;
	private long reals;
	private long tax1;
	private long tax2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getSalarydate() {
		return salarydate;
	}
	public void setSalarydate(String salarydate) {
		this.salarydate = salarydate;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getAllowance() {
		return allowance;
	}
	public void setAllowance(long allowance) {
		this.allowance = allowance;
	}
	public long getManager() {
		return manager;
	}
	public void setManager(long manager) {
		this.manager = manager;
	}
	public long getReals() {
		return reals;
	}
	public void setReals(long reals) {
		this.reals = reals;
	}
	public long getTax1() {
		return tax1;
	}
	public void setTax1(long tax1) {
		this.tax1 = tax1;
	}
	public long getTax2() {
		return tax2;
	}
	public void setTax2(long tax2) {
		this.tax2 = tax2;
	}
}
