package com.tech.msv.servicetemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.msv.servicetemplate.model.ServiceResponse;
import com.tech.msv.servicetemplate.service.BaseService;

@RestController
@RequestMapping(value = "/api/service")
public class BaseController {
	
	private final BaseService service;
	
	@Autowired
	public BaseController(final BaseService service) {
		this.service = service;
	}
	
	@RequestMapping(method={RequestMethod.GET},value = "/getHealth")
	public ResponseEntity<ServiceResponse> getHealth()
	{
		return ResponseEntity.ok(ServiceResponse.builder()
				.responseCode("200").responseDesription("SUCCESS").response("UP").build());
	}

}
