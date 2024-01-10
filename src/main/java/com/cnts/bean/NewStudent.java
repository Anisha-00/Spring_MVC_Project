package com.cnts.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class NewStudent {
	
	 private long admissionNo;
	 @NotEmpty(message = "name is required")
	 private String studentName;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 @NotEmpty(message = "enter dob")
	 private String dob;
	 private String fatherName;
	 private String motherName;
	 private String fatherOccupation;
	 private String motherOccupation;
	 @NotEmpty(message = "enter address")
	 private String address;
	 @NotNull(message = "enter phone number")
	 private long phoneNumber;
	 private String nationality;
	 @NotBlank(message = "enter class")
	 private String classAdmissionFor;
	 
	 
	public long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(long admissionNo) {
		this.admissionNo = admissionNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getClassAdmissionFor() {
		return classAdmissionFor;
	}
	public void setClassAdmissionFor(String classAdmissionFor) {
		this.classAdmissionFor = classAdmissionFor;
	}
	@Override
	public String toString() {
		return "NewStudent [admissionNo=" + admissionNo + ", studentName=" + studentName + ", dob=" + dob
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", fatherOccupation=" + fatherOccupation
				+ ", motherOccupation=" + motherOccupation + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", nationality=" + nationality + ", classAdmissionFor=" + classAdmissionFor + "]";
	}
	
}
