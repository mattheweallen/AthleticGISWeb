package com.athleticgis;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;

@ManagedBean
@RequestScoped
public class UploadBean implements Serializable {
	private static final long serialVersionUID = -290191374294978569L;
	private Part file;
	private String fileContent;

	public void upload() {
		try {
			setFileContent(new Scanner(file.getInputStream())
					.useDelimiter("\\A").next());
		} catch (IOException e) {
			// Error handling
		}
	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}

	public void validateFile(FacesContext ctx, UIComponent comp, Object value) {
		List<FacesMessage> msgs = new ArrayList<FacesMessage>();
		Part file = (Part) value;
//		if (file.getSize() > 1024) {
//			msgs.add(new FacesMessage("file too big"));
//		}
//		if (!"text/plain".equals(file.getContentType())) {
//			msgs.add(new FacesMessage("not a text file"));
//		}
		if (!msgs.isEmpty()) {
			throw new ValidatorException(msgs);
		}
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

}
