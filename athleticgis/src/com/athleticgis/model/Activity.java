package com.athleticgis.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Activity implements Serializable {
	private static final long serialVersionUID = -5559373126260120902L;
	private String name;
	private Timestamp date;
	
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
