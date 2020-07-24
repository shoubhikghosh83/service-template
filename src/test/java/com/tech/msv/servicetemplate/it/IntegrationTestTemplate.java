package com.tech.msv.servicetemplate.it;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import com.tech.msv.servicetemplate.ServiceTemplateApplication;

@SpringBootTest(classes = ServiceTemplateApplication.class, webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration
public class IntegrationTestTemplate {

}
