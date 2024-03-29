package com.ant.oms.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="order_master")
public class Order implements BaseEntity{
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
	private String deliveryLocation;
	private Address deliveryAddress;
	private String comment;
	private Collection<OrderItem> items;
	private float totalAmount;
	private Status status;

	@Id
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
	@ManyToOne(targetEntity=Customer.class)
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
	@OneToMany(mappedBy="parentOrder", fetch=FetchType.LAZY)
	public Collection<OrderItem> getItems() {
		return items;
	}
	public void setItems(Collection<OrderItem> items) {
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
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	@OneToOne(optional=true)
	public Address getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}
