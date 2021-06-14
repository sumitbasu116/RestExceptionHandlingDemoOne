package com.sumit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sumit.util.ApplicationContextHelper;
import com.sumit.util.messaging.MessageService;
import com.sumit.util.messaging.MessageServiceImplementation;

//Internationalization: step5
public class ErrorModel {
//	@JsonIgnore
	private final MessageService messageService = (MessageService) ApplicationContextHelper.getBean(MessageServiceImplementation.class);
//	@Autowired
//	private MessageServiceImplementation messageService;
	
	@JsonProperty
	private int code;
	@JsonProperty
	private String msg;
	
	public void setCode(int code) {
		this.code = code;
	}

	public void setMsg() {
		String message = messageService.getMessage(code);
		this.msg = message;
	}
	public void setMsg(long id) {
		String message = messageService.getMessage(code,(Object)id);
		this.msg = message;
	}
}
