package com.rach.corpDirDropwizard;


public class Employee {
	private int empId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String designation;
	private String department;
	private String email;
	private String deskPhone;
	private String cellPhone;
	private String deskLocation;
	private String buildingLocation;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeskPhone() {
		return deskPhone;
	}
	public void setDeskPhone(String deskPhone) {
		this.deskPhone = deskPhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getDeskLocation() {
		return deskLocation;
	}
	public void setDeskLocation(String deskLocation) {
		this.deskLocation = deskLocation;
	}
	public String getBuildingLocation() {
		return buildingLocation;
	}
	public void setBuildingLocation(String buildingLocation) {
		this.buildingLocation = buildingLocation;
	}
	@Override
	public String toString() {
		return getEmpId()+"-"+ getFirstName()+"-"+getMiddleName()+"-"+getLastName()+"-"+getDesignation()+"-"+getDepartment()
		+"-"+getEmail()+"-"+getDeskPhone()+"-"+getCellPhone()+"-"+getDeskLocation()+"-"+getBuildingLocation();
	}

}

