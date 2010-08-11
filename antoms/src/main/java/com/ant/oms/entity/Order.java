package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Order implements Serializable{
	/**
	 * 
	 */
	public static enum Status {NEW, SCHEDULED, DISPATCHED, DILEVERED,DONE,CANCELLED};  
	private static final long serialVersionUID = 6500207874243731473L;
	private long id;
	private Date placeOn;
	private Customer placedBy;
	private Date deliveryOn;
	private String customerComment;
	private String comment;
	@OneToMany(mappedBy="order", fetch=FetchType.LAZY)
	private Set<OrderItem> items;
	private float totalAmount;
	private Status status;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {		
		this.id = id;
	}
	public Date getPlaceOn() {
		return placeOn;
	}
	public void setPlaceOn(Date placeOn) {
		this.placeOn = placeOn;
	}
	public Customer getPlacedBy() {
		return placedBy;
	}
	public void setPlacedBy(Customer placedBy) {
		this.placedBy = placedBy;
	}
	public Date getDeliveryOn() {
		return deliveryOn;
	}
	public void setDeliveryOn(Date deliveryOn) {
		this.deliveryOn = deliveryOn;
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
	public Set<OrderItem> getItems() {
		return items;
	}
	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Status getStatus() {
		return status;
	}
}
