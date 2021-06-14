package com.sumit.util.messaging;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Internationalization: step3
@Service
public class MessageServiceImplementation implements MessageService {

	@Autowired
	private MessageSource messageSource;

	@Override
	public String getMessage(int erroCode) {

		String messageCode = "error_code_" + erroCode;
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(messageCode, null, locale);

	}

	@Override
	public String getMessage(int erroCode, Object... messageArg) {

		String messageCode = "error_code_" + erroCode;
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(messageCode, messageArg, locale);

	}

	@Override
	public String getMessageForMissingParam(String errorFieldName) {

		String messageCode = "error_missing_param_" + errorFieldName;
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(messageCode, null, locale);

	}

	@Override
	public String getMessage(String messageFieldKey) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(messageFieldKey, null, locale);
	}

}
