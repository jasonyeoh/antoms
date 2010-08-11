package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class OrderItem  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8907475819564141091L;
	private long id;
	private Order order;
	private int itemNumber;
	private float quantity;
	private CatalogEntry item;
	private String customerComment;
	private String comment;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public CatalogEntry getItem() {
		return item;
	}
	public void setItem(CatalogEntry item) {
		this.item = item;
	}
	public String getCustomerComment() {
		return customerComment;
	}
	public void setCustomerComment(String customerComment) {
		this.customerComment = customerComment;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
}
