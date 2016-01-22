package com.ontariomd.hrm.service.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="GetNewMessagesResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetNewMessagesResponse extends AbstractResponse{
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name="messages",required=true)
	private GetNewMessagesMessageInfo[] messages;

	public GetNewMessagesMessageInfo[] getMessages() {
		return messages;
	}

	public void setMessages(GetNewMessagesMessageInfo[] messages) {
		this.messages = messages;
	}

	

	
}
