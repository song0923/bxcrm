package com.bx.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bx.login.services.LoginService;

/**
 * @Description: TODO
 * @author song.zhang0923@gmail.com
 * @date 2013-6-7 下午4:20:35
 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
}
