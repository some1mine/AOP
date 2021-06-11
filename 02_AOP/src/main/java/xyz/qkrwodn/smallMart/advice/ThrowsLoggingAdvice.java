package xyz.qkrwodn.smallMart.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class ThrowsLoggingAdvice implements ThrowsAdvice{

	public void afterThrowing(Throwable throwable){
		System.out.println("예외 발생함");
	}

}
