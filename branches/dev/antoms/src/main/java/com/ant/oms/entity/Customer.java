package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 217613821637L;
	private long id;
	private String name;
	private String company;
	private String designation;
	private String email;
	private Address home;
	private Address office;
	private String cellPhone;
	private String homePhone;
	private String homeFax;
	private String officePhone;
	private String officeFax;
	private Login login; 
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String oficePhone) {
		this.officePhone = oficePhone;
	}
	public String getHomeFax() {
		return homeFax;
	}
	public void setHomeFax(String homeFax) {
		this.homeFax = homeFax;
	}
	public String getOfficeFax() {
		return officeFax;
	}
	public void setOfficeFax(String officeFax) {
		this.officeFax = officeFax;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Login getLogin() {
		return login;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	
	
}
