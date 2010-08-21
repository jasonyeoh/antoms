package com.ant.oms.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class UIMenu implements Serializable, BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 488978528910789954L;
	private long id;
	private String name;
	private UIMenu parent;
	private String url;
	private List<UIMenu> childern;
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
	public UIMenu getParent() {
		return parent;
	}
	public void setParent(UIMenu parent) {
		this.parent = parent;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@OneToMany(mappedBy="parent", fetch=FetchType.LAZY)
	public List<UIMenu> getChildern() {
		return childern;
	}
	public void setChildern(List<UIMenu> childern) {
		this.childern = childern;
	}	
}
