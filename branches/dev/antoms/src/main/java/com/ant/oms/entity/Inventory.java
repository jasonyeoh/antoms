package com.ant.oms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Inventory implements  BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6595496545971807956L;
	private long id;
	private CatalogEntry item;
	private int quantity;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@OneToOne(optional=true)
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
