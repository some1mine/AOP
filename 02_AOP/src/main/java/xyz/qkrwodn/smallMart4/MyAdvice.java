package xyz.qkrwodn.smallMart4;

import org.aspectj.lang.JoinPoint;

public class MyAdvice {
	public void beforeAdv(JoinPoint jp){
		System.out.println("사전 충고 실행");
	}
}
