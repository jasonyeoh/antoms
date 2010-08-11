package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OrderItem  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8907475819564141091L;
	private long id;
	private Order parentOrder;
	private int itemNumber;
	private double quantity;
	private CatalogEntry item;
	private String customerComment;
	private String comment;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Order getParentOrder() {
		return parentOrder;
	}
	public void setParentOrder(Order order) {
		this.parentOrder = order;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
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
}
