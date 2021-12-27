package com.xworkz.Collections.Employee.DAO;

import com.xworkz.Collections.Employee.DTO.EmployeeDto;

public interface EmpDaoInterface {
	public void save(int key,EmployeeDto dto);
	public void display();

}
