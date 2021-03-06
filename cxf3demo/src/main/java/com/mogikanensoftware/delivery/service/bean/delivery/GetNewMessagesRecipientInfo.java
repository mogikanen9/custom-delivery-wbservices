package com.mogikanensoftware.delivery.service.bean.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.mogikanensoftware.delivery.service.bean.AbstractBean;

@XmlRootElement
@XmlType(name="GetNewMessagesRecipientInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetNewMessagesRecipientInfo extends AbstractBean{

	private static final long serialVersionUID = 1L;

	@XmlElement(name="identityType",required=true)
	private RecipientIdentityType identityType;
	
	@XmlElement(name="identityValue",required=true)
	private String identityValue;

	public RecipientIdentityType getIdentityType() {
		return identityType;
	}

	public void setIdentityType(RecipientIdentityType identityType) {
		this.identityType = identityType;
	}

	public String getIdentityValue() {
		return identityValue;
	}

	public void setIdentityValue(String identityValue) {
		this.identityValue = identityValue;
	} 
}
