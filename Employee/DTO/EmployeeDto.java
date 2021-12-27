package com.xworkz.Collections.Employee.DTO;

public class EmployeeDto {
	private String empName;
	private String place;
	private int age;
	private int salary;
	
	public EmployeeDto( String empName, String place, int age, int salary) {
		this.empName = empName;
		this.place = place;
		this.age = age;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empName=" + empName + ", place=" + place + ", age=" + age + ", salary=" + salary + "]";
	}
	
	}

