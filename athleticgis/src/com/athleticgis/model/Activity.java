package com.athleticgis.model;

import java.sql.Timestamp;

public class Activity {
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
