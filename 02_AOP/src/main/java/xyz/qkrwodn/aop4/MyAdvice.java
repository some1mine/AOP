package xyz.qkrwodn.aop4;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAdvice{
	public void customBefore(JoinPoint joinPoint, int val) {
		if (val > 5000) {
			System.out.println("사전충고 실행");
		}
	}

	public Object customAround(ProceedingJoinPoint pjp, int val) throws Throwable {
		if (val < 5000) {
			System.out.println("주변 충고 전처리");
		}
		return pjp.proceed();
	}
}
