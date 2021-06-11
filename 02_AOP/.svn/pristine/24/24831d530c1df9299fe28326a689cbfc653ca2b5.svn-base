package xyz.qkrwodn.aop2;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

import xyz.qkrwodn.smallMart.advice.AroundLoggingAdvice;

public class Aop2App {
	public static void main(String[] args) {
		First first = new First();
		
		System.out.println("========= origin ============");
		first.hello();
		first.sayHello();
		
		AnnotationMatchingPointcut pc = new AnnotationMatchingPointcut(AdviceRequired.class);
		Advisor advisor = new DefaultPointcutAdvisor(pc, new AroundLoggingAdvice());

		// 프록시 팩토리 객체 생성
		ProxyFactory pf = new ProxyFactory();
		
		// 어드바이저 추가
		pf.addAdvisor(advisor);
		
		// 타겟 설정
		pf.setTarget(first);
		
		// 프록시 객체 생성
		First proxy1 = (First) pf.getProxy();
		
		System.out.println("======== proxy ===========");
		proxy1.hello();
		proxy1.sayHello();
	}
}
