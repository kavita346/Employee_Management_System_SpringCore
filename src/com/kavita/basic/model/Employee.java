package com.kavita.basic.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee 

{
	private int  empId;
    private String empName;
	private long empPanCardNo; 
	private char empGender;
	private long empAadharNo; 
	private double empSal;	
    private Long empVoterId;
    private Long empAccountNo;
    private String empMarriedStatus;
    private String empEmail;
	private Date empDateOfBirth;
 
	private Date empDateOfJoining;

	private List<String> empMobileNo;
	
	private Set<Address> empAddress; 
	
	private Map<Integer, Project> empProjectInfo;
	
	private String[] skill; 
	
	private Department empDept;
		
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpPanCardNo(long empPanCardNo) {
		this.empPanCardNo = empPanCardNo;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

	public void setEmpAadharNo(long empAadharNo) {
		this.empAadharNo = empAadharNo;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public void setEmpVoterId(Long empVoterId) {
		this.empVoterId = empVoterId;
	}

	public void setEmpAccountNo(Long empAccountNo) {
		this.empAccountNo = empAccountNo;
	}

	public void setEmpMarriedStatus(String empMarriedStatus) {
		this.empMarriedStatus = empMarriedStatus;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public void setEmpDateOfBirth(Date empDateOfBirth) {
		this.empDateOfBirth = empDateOfBirth;
	}

	public void setEmpDateOfJoining(Date empDateOfJoining) {
		this.empDateOfJoining = empDateOfJoining;
	}

	public void setEmpMobileNo(List<String> empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}

	public void setEmpProjectInfo(Map<Integer, Project> empProjectInfo) {
		this.empProjectInfo = empProjectInfo;
	}

	public void setSkill(String[] skill) {
		this.skill = skill;
	}

	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() 
	
	{
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t"+"Employee Information");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		int count = 1;
		StringBuilder sb = new StringBuilder();			
		for(Address  a      :      empAddress)
		{
			sb.append("\n address : "+ 
		    count + " " + a);
			count++;
	    }
		
		return 				
				 "\n\n" + " Id                    :    " + empId + 
				 "\n\n" + " Name                  :    " + empName + 
				 "\n\n" + " Gender                :    " + empGender+	
				 "\n\n" + " Mail                  :    " + empEmail +
				 "\n\n" + " Mobile Number         :    " + empMobileNo +
				 "\n\n" + " Date of Birth         :    " + empDateOfBirth.getDate()+"/"+(empDateOfBirth.getMonth()+1) +"/"+(empDateOfBirth.getYear()+1900)+
				 "\n\n" + " Pan Number            :    " + empPanCardNo  + 
				 "\n\n" + " Aadhar Number         :    " + empAadharNo + 
				 "\n\n" + " Voter Id              :    " + empVoterId +
				 "\n\n" + " Account Number        :    " + empAccountNo +
				 "\n\n" + " Project Infoormation  :    " + empProjectInfo +
				 "\n\n" + " Department            :    " + empDept +
				 "\n\n" + " MarrtialStatus        :    " + empMarriedStatus + 
				 "\n\n" + " Skill                 :    " + Arrays.toString(skill)+
				 "\n\n" + " Salary                :    " + empSal + 				
				 "\n\n" + " Date Of Joining       :    " + empDateOfJoining.getDate()+"/"+(empDateOfJoining.getMonth()+1)+"/"+(empDateOfJoining.getYear()+1900)+ 
				 "\n\n" + " Address               :    " +  sb;

	}
}
