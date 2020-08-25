package com.rach.corpDirDropwizard;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Services {
	private Connection con;
	Services(Connection con){
		this.con = con;
	}
	
	public Employee getEmployeeById(int empId) {
		Employee employee = null;
		try {
			Statement stmt = con.createStatement();
	        ResultSet rs;
	        rs = stmt.executeQuery("SELECT * FROM employee WHERE emp_id = " +empId);
	        while ( rs.next() ) {
	        	int employeeId = rs.getInt("emp_id");
	            String employeeFirstName = rs.getString("first_name");
	            String employeeMidName = rs.getString("middle_name"); 
	            String employeeLastName = rs.getString("last_name");
	            String designation = rs.getString("designation");
	            String department = rs.getString("department");
	            String email = rs.getString("email");
	            String deskPhone = rs.getString("desk_phone");
	            String cellPhone = rs.getString("cell_phone");
	            String deskLocation = rs.getString("building_location");
	            String buildingLocation = rs.getString("building_location");
	            employee = new Employee();
	            employee.setEmpId(employeeId);
	            employee.setFirstName(employeeFirstName);
	            employee.setMiddleName(employeeMidName);
	            employee.setLastName(employeeLastName);
	            employee.setDesignation(designation);
	            employee.setDepartment(department);
	            employee.setEmail(email);
	            employee.setDeskPhone(deskPhone);
	            employee.setCellPhone(cellPhone);
	            employee.setDeskLocation(deskLocation);
	            employee.setBuildingLocation(buildingLocation);
	            
	        }
        }
		catch(Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
		return employee;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Statement stmt = con.createStatement();
	        ResultSet rs;
	        rs = stmt.executeQuery("SELECT * FROM employee");
	        while ( rs.next() ) {
	        	int employeeId = rs.getInt("emp_id");
	            String employeeFirstName = rs.getString("first_name");
	            String employeeMidName = rs.getString("middle_name"); 
	            String employeeLastName = rs.getString("last_name");
	            String designation = rs.getString("designation");
	            String department = rs.getString("department");
	            String email = rs.getString("email");
	            String deskPhone = rs.getString("desk_phone");
	            String cellPhone = rs.getString("cell_phone");
	            String deskLocation = rs.getString("building_location");
	            String buildingLocation = rs.getString("building_location");
	            Employee employee = new Employee();
	            employee.setEmpId(employeeId);
	            employee.setFirstName(employeeFirstName);
	            employee.setMiddleName(employeeMidName);
	            employee.setLastName(employeeLastName);
	            employee.setDesignation(designation);
	            employee.setDepartment(department);
	            employee.setEmail(email);
	            employee.setDeskPhone(deskPhone);
	            employee.setCellPhone(cellPhone);
	            employee.setDeskLocation(deskLocation);
	            employee.setBuildingLocation(buildingLocation);
	            employees.add(employee);
	            
	        }
        }
		catch(Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
		return employees;
	}
	
}