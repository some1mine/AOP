package xyz.qkrwodn.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SmallMartPointCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().equals("getProducts2");
	}
	
}
