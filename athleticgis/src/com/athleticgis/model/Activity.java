package com.athleticgis.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Activity implements Serializable {
	private static final long serialVersionUID = -5559373126260120902L;
	private String name;
	private Timestamp date;
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
}
