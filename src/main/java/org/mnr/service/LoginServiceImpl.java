package org.mnr.service;

import org.mnr.dto.User;

public class LoginServiceImpl implements LoginService {

	@Override
	public boolean validateLogin(User user) {
		if((user.getName().length()>2)&&(user.getPassword().length()>2))
			return true;
		return false;
	}

}
