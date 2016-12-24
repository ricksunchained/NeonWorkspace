package com.ricks.advice;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] m_args, Object target) throws Throwable {
		Logger log = Logger.getLogger(target.getClass().getName());
		log.info("After Exicuting: " + target.getClass().getName() + " within method " + method.getName()
				+ " having args value" + ((m_args).length > 0 ? m_args[0] : m_args)+"with returning values "+returnValue);
	}

}
