package com.sumit.util.messaging;

public interface MessageService {

	
	public String getMessage(int erroCode);
	
	public String getMessage(String messageFieldKey);
	
	public String getMessage(int erroCode,Object... messageArg);
	
	public String getMessageForMissingParam(String errorFieldName);
	
}

