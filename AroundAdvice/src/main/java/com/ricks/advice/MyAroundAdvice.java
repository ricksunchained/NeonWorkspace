package com.ricks.advice;

import java.io.FileOutputStream;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import com.ricks.exception.InvalidUserException;
import com.ricks.security.UserAuthorization;

public class MyAroundAdvice implements MethodInterceptor {
	Logger log = Logger.getLogger(MyAroundAdvice.class);

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object returnVal = null;
		log.info("Entered Method " + invocation.getMethod().getName() + " of class " + invocation.getClass().getName()
				+ " having args values " + invocation.getArguments().toString());
		if (UserAuthorization.isUserAuthorized("Admin User")) {
		returnVal = invocation.proceed();
		}else{
			throw new InvalidUserException("Invalide User");
		}
		log.info("The return value of " + invocation.getMethod().getName() + " is " + returnVal);
		return returnVal;
	
	}

}
