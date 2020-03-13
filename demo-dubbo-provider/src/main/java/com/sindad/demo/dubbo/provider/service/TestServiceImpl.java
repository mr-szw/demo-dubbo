package com.sindad.demo.dubbo.provider.service;

import java.util.Date;
import org.springframework.stereotype.Service;
import com.sindad.demo.dubbo.client.service.TestService;


@Service
public class TestServiceImpl implements TestService {


	@Override
	public String testMethod() {

		return "This the testMethod on: " + new Date().toString();
	}
}
