package org.mnr.action;

import org.apache.commons.lang.StringUtils;
import org.mnr.service.TutorialService;
import org.mnr.service.TutorialServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class TutorialAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String language;
	private String message;
	


	public void validate() {
		if(StringUtils.isEmpty(getLanguage()))
			addFieldError("language", "Language Cannot Be Empty");
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String searchTutorial(){
		System.out.println("search method");
		TutorialService service =	 new TutorialServiceImpl();
		String message	=	service.search(getLanguage()); 
		
			setMessage(message);
			return SUCCESS;
	}
	
	public String addTutorial(){
		
		TutorialService service =	 new TutorialServiceImpl();
		if(service.add(getLanguage()))
			setMessage(" Added Successfully");
		else
			setMessage(" Already exists");
		return SUCCESS;
	}
	
	public String updateTutorial(){
		
		TutorialService service =	 new TutorialServiceImpl();
		if(service.add(getLanguage()))
			setMessage(" updated Successfully");
		else
			setMessage(" doesn't exists");
		return SUCCESS;
		
	}
	
	public String deleteTutorial(){
			
		TutorialService service =	 new TutorialServiceImpl();
		if(service.add(getLanguage()))
			setMessage(" deleted Successfully");
		else
			setMessage(" doesn't exists");
		return SUCCESS;
		}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
