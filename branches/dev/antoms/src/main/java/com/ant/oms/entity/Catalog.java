package com.ant.oms.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Catalog implements BaseEntity{
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
	private Collection<CatalogEntry> entries;
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
	@Column(name="catalog_desc")
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
	@OneToMany(mappedBy="catalog")
	public Collection<CatalogEntry> getEntries() {
		return entries;
	}
	public void setEntries(Collection<CatalogEntry> entries) {
		this.entries = entries;
	}
	
	
}
