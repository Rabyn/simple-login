package com.cubic.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.put("user", getLoggedInUserName());
		return "welcome";
	}
	
	private String getLoggedInUserName() {
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails)
            return ((UserDetails) principal).getUsername();

        return principal.toString();
    }

	
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
	 * String showLoginPage() { return "login"; }
	 * 
	 * @RequestMapping(value = "/dashboard", method = RequestMethod.POST) public
	 * String dashboardHandler(@ModelAttribute("loginForm") UserVo user,
	 * ModelMap model) {
	 * 
	 * if (!service.validateUser(user.getUserName(), user.getPassword())) {
	 * model.put("errorMessage", "Some error in person data"); return "login"; }
	 * else { model.put("user", user.getUserName()); return "welcome"; }
	 * 
	 * }
	 */

}
