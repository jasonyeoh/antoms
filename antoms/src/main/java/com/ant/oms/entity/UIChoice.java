package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
@Entity
public class UIChoice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -663837231505178445L;
	private long id;
	private String key;
	private String value;
	private String locale;
	private String choiceId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getChoiceId() {
		return choiceId;
	}
	public void setChoiceId(String choiceId) {
		this.choiceId = choiceId;
	}
}
