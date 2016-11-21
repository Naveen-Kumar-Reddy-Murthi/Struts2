package org.mnr.action;

import org.apache.commons.lang.StringUtils;
import org.mnr.dto.User;
import org.mnr.service.LoginService;
import org.mnr.service.LoginServiceImpl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	User user= new User();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String execute(){
		
		LoginService service = new LoginServiceImpl();
		if(service.validateLogin(user))
			return SUCCESS;
		return ERROR;
		
		
	}
	


	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	public void validate() {
		System.out.println("user:"+user);
		System.out.println("validate method");
		if(StringUtils.isEmpty(user.getName()))
			addFieldError("name", "Name Cannot Be Blank");
		if(StringUtils.isEmpty(user.getPassword())){
			addFieldError("password", "Password Cannot Be Blank");
		}
		
    }
	
	
}
