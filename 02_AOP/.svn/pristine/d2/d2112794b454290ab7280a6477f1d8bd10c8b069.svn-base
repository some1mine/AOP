package xyz.qkrwodn.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import xyz.qkrwodn.aop1.SimpleStaticPointCut;
import xyz.qkrwodn.smallMart.advice.AfterLoggingAdvice;
import xyz.qkrwodn.smallMart.advice.AroundLoggingAdvice;
import xyz.qkrwodn.smallMart.advice.BeforeLoggingAdvice;
import xyz.qkrwodn.smallMart.advice.ThrowsLoggingAdvice;

public class SmallMartApp {
	public static void main(String[] args) {
		
		// 대상 객체 생성
		SmallMart target = new SmallMartImpl();
		
		// 프록시팩토리 생성
		ProxyFactory factory = new ProxyFactory();
		
		
		// 충고 추가
		factory.addAdvisor(new DefaultPointcutAdvisor(new StaticMethodMatcherPointcut() {
			
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				// TODO Auto-generated method stub
				return method.getName().endsWith("2");
			}
		}, new AfterLoggingAdvice()));
		// 대상 설정
		factory.setTarget(target);
		// 프록시 객체 생성 (SmallMart 타입)
		SmallMart proxy = (SmallMart) factory.getProxy();
		try {
//			System.out.println("======= origin ======");
//			target.getProducts("치약");
			System.out.println("====== proxy =====");
			proxy.getProducts("칫솔");
			proxy.getProducts2("치실");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
