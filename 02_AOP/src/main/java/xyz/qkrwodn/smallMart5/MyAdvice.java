package xyz.qkrwodn.smallMart5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect @Service
public class MyAdvice {
	@Before("execution(* *2(..))")
	public void beforeAdv(JoinPoint jp){
		System.out.println("사전 충고 실행");
	}
}
