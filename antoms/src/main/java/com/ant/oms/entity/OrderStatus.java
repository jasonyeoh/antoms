package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class OrderStatus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1470657899145739691L;
	private long id;
	private Order order;
	private Date statusDate;
	private String status;
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
