package com.mvc.demo.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sindad.demo.dubbo.client.service.TestService;

/**
 * @author Dawei 2018/11/17
 */
@RestController
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


	@Resource
	private TestService testService;


	@GetMapping(value = "/login")
	public String login(String token) {
		logger.info(">>>>>>>>>>>>>>>> {}", token);
		System.out.println(testService.testMethod());
		return "token+ " + token;
	}

}
