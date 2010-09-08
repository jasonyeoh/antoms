package com.ant.oms.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class UIMenu implements  BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 488978528910789954L;
	private long id;
	private String menuId;
	private String displayName;
	private UIMenu parent;
	private String url;
	private Collection<UIMenu> childern;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String name) {
		this.displayName = name;
	}
	@ManyToOne(optional=false)
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
	public Collection<UIMenu> getChildern() {
		return childern;
	}
	public void setChildern(Collection<UIMenu> childern) {
		this.childern = childern;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuId() {
		return menuId;
	}	
}
