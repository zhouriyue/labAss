package com.gxuwz.lab_assistant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 菜单类
 * @author 周日月
 *
 */
@Entity(name = "menu")
public class Menu {
	
	@Id
	@Column(name="menu_id")
	private String menuId;
	@Column(name="menu_name")
	private String menuName;
	@Column(name="menu_pid")
	private String menuPid;
	private String url;
	private String icon;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMenuId() {
		return menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public String getMenuPid() {
		return menuPid;
	}
	public String getUrl() {
		return url;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public void setMenuPid(String menuPid) {
		this.menuPid = menuPid;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuPid=" + menuPid + ", url=" + url + "]";
	}
	
}
