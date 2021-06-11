package xyz.qkrwodn.smallMart.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("around before 처리함");
		Object obj = invocation.proceed();
		System.out.println("around after 처리함");
		return obj;
	}

	
}
