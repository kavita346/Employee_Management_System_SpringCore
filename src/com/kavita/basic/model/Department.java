package com.kavita.basic.model;

public class Department 
{
	private Integer departmentId;
	private String departmentName;
	private String departmentSubject;
	
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public void setDepartmentSubject(String departmentSubject) {
		this.departmentSubject = departmentSubject;
	}
	
	@Override
	public String toString() {
		return "departmentId : " + departmentId + " departmentName : " + departmentName
				+ " departmentSubject : " + departmentSubject ;
	}
	
	

}
