package com.cnts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "new_stdent_data")
public class NewStudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "admissionNo")
	private Long admissionNo;
	@Column(name = "studentName")
	private String studentName;
	@Column(name = "dob")
	private String dob;
	@Column(name = "fatherName")
	private String fatherName;
	@Column(name = "motherName")
	private String motherName;
	@Column(name = "fatherOccupation")
	private String fatherOccupation;
	@Column(name = "motherOccupation")
	private String motherOccupation;
	@Column(name = "address")
	private String address;
	@Column(name = "phoneNumber")
	private Long phoneNumber;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "classAdmissionFor")
	private String classAdmissionFor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(Long admissionNo) {
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
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
}
