package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Inventory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6595496545971807956L;
	private long id;
	private CatalogEntry item;
	private int quantity;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public CatalogEntry getItem() {
		return item;
	}
	public void setItem(CatalogEntry item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
