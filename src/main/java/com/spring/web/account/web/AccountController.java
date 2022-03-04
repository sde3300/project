package com.spring.web.account.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.web.account.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/account/register", method=RequestMethod.GET)
	public String register() {
		return "/account/register";
	}
	
	@RequestMapping(value="/account/login", method=RequestMethod.GET)
	public String login() {
		return "/account/login";
		
	}
	
}
