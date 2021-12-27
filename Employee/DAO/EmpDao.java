package com.xworkz.Collections.Employee.DAO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import com.xworkz.Collections.Employee.DTO.EmployeeDto;
import java.util.Map.Entry;

public class EmpDao implements EmpDaoInterface{
	
	HashMap<Integer, Object> employee=new HashMap<Integer, Object>();
	
	public void save(int key, EmployeeDto dto) {
		employee.put(key,dto);		
	}

	
	public void display() {
		
		Set<Entry<Integer, Object>> entryset=employee.entrySet();
		
		Iterator<Entry<Integer, Object>> iterator=entryset.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, Object> next =iterator.next();
			
			System.out.println("key : "+next.getKey()+" Value : "+next.getValue());
			
		}
	}
	
	
}
