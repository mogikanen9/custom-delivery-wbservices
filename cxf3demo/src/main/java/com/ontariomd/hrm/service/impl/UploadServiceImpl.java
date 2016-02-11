package com.ontariomd.hrm.service.impl;

import javax.jws.WebService;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;

import com.ontariomd.hrm.service.UploadService;
import com.ontariomd.hrm.service.bean.upload.UploadMessageRequest;
import com.ontariomd.hrm.service.bean.upload.UploadMessageResponse;

@WebService(endpointInterface = "com.ontariomd.hrm.service.UploadService", portName = "UploadServicePort", serviceName = "UploadService")
public class UploadServiceImpl implements UploadService {

	public UploadMessageResponse uploadMessage(UploadMessageRequest request) {
		UploadMessageResponse response = new UploadMessageResponse();
		
		response.setResponseTransactionUid("UPL-"+System.currentTimeMillis());
		
		return response;
	}

}
