package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Offer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3821773118799572719L;
	private long id;
	private String offerName;
	private Date asOf;
	private Date exire;
	private String description;
	private float discountRate;
	private String processor;
	@Id
	public long getId() {
		return id;
	}  
	public void setId(long id) {
		this.id = id;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public Date getAsOf() {
		return asOf;
	}
	public void setAsOf(Date asOf) {
		this.asOf = asOf;
	}
	public Date getExire() {
		return exire;
	}
	public void setExire(Date exire) {
		this.exire = exire;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}

}
