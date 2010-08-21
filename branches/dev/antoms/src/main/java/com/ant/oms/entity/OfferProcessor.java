package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.ant.oms.util.OfferProcessorEngine;

/**
 * This class represents an offer processor. An offer processor will be attached to an {@link #Offer}.
 * An offer processor can be a javascript (JS) of Java (JAVA) class. 
 * In case of JS, a method processOrder() name. Exact syntax is as follows: 
 * <pre>
 * function processOrder(order, oms){
 * 	order.price -= (order.price * 0.5) 
 * 	order.comment += "\n[SUMMER SALE] 5% offer discount\n";
 * }
 * </pre>
 * In this example offer is reducing 5% from the nett amount and adding comment to the order object for same.
 * This method is invoked while processing an order. All the specific offer logic can be implemented in this method. 
 * This method is put into {@link processorData} field and stored in database.
 * 
 * In case of JAVA, a class implementing {@link OfferProcessorEngine} has to be implemented and put into classpath.
 * Here {@link processorData} will have the fully qualified name of the class. 
 * 
 * @author yogendra
 *
 */
@Entity
public class OfferProcessor implements Serializable, BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4552791915292415213L;
	public static enum Type { JAVA, JS };
	private long id;
	private String name;
	private String processorData;
	private Type processorType;
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
	public Type getProcessorType() {
		return processorType;
	}
	public void setProcessorType(Type processorType) {
		this.processorType = processorType;
	}
	public String getProcessorData() {
		return processorData;
	}
	public void setProcessorData(String processorData) {
		this.processorData = processorData;
	}
	
}
