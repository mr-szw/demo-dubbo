package com.sindad.demo.dubbo.provider.service;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;

@Service
@Path("/")
public class TestServiceImpl implements com.sindad.demo.dubbo.client.service.TestService  {


	@GET
	@Path("/get")
	@Override
	public String testMethod() {

		return "This the testMethod on: " + new Date().toString();
	}
}
