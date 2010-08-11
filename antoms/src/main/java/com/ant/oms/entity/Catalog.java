package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.OneToMany;

public class Catalog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8082890736164833910L;
	private long id;
	private String name;
	private Date launchDate;
	private boolean active;
	private String description;
	private Image coverPage;
	@OneToMany(mappedBy="catalog")
	private Set<CatalogEntry> entries;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Image getCoverPage() {
		return coverPage;
	}
	public void setCoverPage(Image coverPage) {
		this.coverPage = coverPage;
	}
	public Set<CatalogEntry> getEntries() {
		return entries;
	}
	public void setEntries(Set<CatalogEntry> entries) {
		this.entries = entries;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	
	
}
