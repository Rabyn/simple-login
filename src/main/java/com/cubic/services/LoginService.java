package com.cubic.services;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		if(StringUtils.isEmpty(user) || StringUtils.isEmpty(password)){
			return false;
		}
		else{
			return user.equalsIgnoreCase("admin") && password.equals("admin");	
		}
		
	}

}