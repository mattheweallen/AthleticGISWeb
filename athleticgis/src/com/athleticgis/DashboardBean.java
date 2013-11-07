package com.athleticgis;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.athleticgis.model.Activity;

import java.io.File;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

@ManagedBean
@SessionScoped
public class DashboardBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Activity> activities;
	
	public List<Activity> getActivities() {
		//hard coded
		activities = new ArrayList<Activity>();
		Activity a = new Activity();
		a.setDate(new Timestamp((new Date()).getTime()));
		a.setName("Tuesday Night World Championships");
		activities.add(a);
		return activities;
	}
	
	public void fileUploadListener(FileUploadEvent event) throws Exception {
		UploadedFile item = event.getUploadedFile();
//	    File file = new File();
//	    file.setLength(item.getData().length);
//	    file.setName(item.getName());
//	    file.setData(item.getData());
//	    files.add(file);
//	    uploadsAvailable--;
	}
//	public void setActivityName(List<Activity> activities) {
//		this.activities = activities;
//	}
}
