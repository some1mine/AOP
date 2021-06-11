package xyz.qkrwodn.ally;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MsgDeco implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj = invocation.proceed();
		System.out.println("세상");
		return obj;
	}
	
}
