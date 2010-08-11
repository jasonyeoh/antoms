package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CatalogEntry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8867817008003179312L;
	private long id;
	private String name;
	private String description;
	private Image image;
	private float price;
	private Catalog catalog;
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
	@Column(name="entry_desc")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image images) {
		this.image = images;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	public Catalog getCatalog() {
		return catalog;
	}
}