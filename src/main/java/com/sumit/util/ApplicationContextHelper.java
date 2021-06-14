package com.sumit.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//Internationalization: step4
@Component
public class ApplicationContextHelper implements ApplicationContextAware{

	private static ApplicationContext applicationContext;
	@Override
	@Autowired
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		ApplicationContextHelper.applicationContext=context;
		
	}
	
	public static ApplicationContext getApplicationContext()
	{
		return applicationContext;
	}
	
	public static Object getBean(Class<?> clazz)
	{
		return applicationContext.getBean(clazz);
	}

}
