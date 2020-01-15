package com.viva.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	JmsTemplate jms;
	
	@RequestMapping("/send/{message}")
	public String sendMessage(@PathVariable("message") String message) {
		jms.convertAndSend("testqueue",message);
		return "Ok";
	}
}
