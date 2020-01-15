package com.viva.activemq.listener;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@JmsListener(destination = "testqueue")
	public String receiveMessage(final String message) throws JMSException {
		String messageData = null;
		System.out.println("Received message " + message);
		return message;
	}
}
