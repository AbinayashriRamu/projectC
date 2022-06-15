package com.chainsys.application.doctor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Doctor {
	@Id
	private int doctor_Id ;
	private String doctor_name;
	private Date dob  ;
	private String speciality ;
	private String city  ;
	private long phoneno  ;
	private int standard_fees ;
	public int getDoc_Id() {
		return doctor_Id;
	}
	public void setDoc_Id(int doc_Id) {
		this.doctor_Id = doc_Id;
	}
	public String getDoc_name() {
		return doctor_name;
	}
	public void setDoc_name(String doc_name) {
		this.doctor_name = doc_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhonenumber() {
		return phoneno;
	}
	public void setPhonenumber(long phonenumber) {
		this.phoneno = phonenumber;
	}
	public int getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(int standard_fees) {
		this.standard_fees = standard_fees;
	}
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %d",doctor_Id,doctor_name,dob,city,phoneno);
	}

}
