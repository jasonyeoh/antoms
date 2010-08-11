package com.ant.oms.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity
public class UIMenu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 488978528910789954L;
	private long id;
	private String name;
	private String parentName;
	private String url;
	private List<UIMenu> childern;
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
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@OneToMany(mappedBy="parentName", fetch=FetchType.LAZY)
	public List<UIMenu> getChildern() {
		return childern;
	}
	public void setChildern(List<UIMenu> childern) {
		this.childern = childern;
	}	
}
