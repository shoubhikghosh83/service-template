package com.tech.msv.servicetemplate.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceResponse {

	private String responseCode;
	private String responseDesription;
	private Object response;
}
