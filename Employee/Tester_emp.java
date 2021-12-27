package com.xworkz.Collections.Employee;
import com.xworkz.Collections.Employee.DAO.EmpDao;
import com.xworkz.Collections.Employee.DTO.EmployeeDto;


public class Tester_emp {

	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		
		EmployeeDto emp1=new EmployeeDto( "Surya", "Chennai", 24, 35000);
		EmployeeDto emp2=new EmployeeDto( "Prabhanjan", "Mysore", 29, 55000);
		EmployeeDto emp3=new EmployeeDto( "Shree", "Belgaum", 30, 50000);
		EmployeeDto emp4=new EmployeeDto( "Vibha", "Belgaum", 32, 60000);
		EmployeeDto emp5=new EmployeeDto( "Niranjan", "Bangalore", 31, 70000);	
		dao.save(11, emp1);
		dao.save(12, emp2);
		dao.save(13, emp3);
		dao.save(14, emp4);
		dao.save(15, emp5);
		
		System.out.println("--------------------------------------------------------");
		
		dao.display();		
		System.out.println("--------------------------------------------------------");

	}

}
