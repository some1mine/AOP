package xyz.qkrwodn.smallMart4;

import java.lang.reflect.Method;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javassist.tools.reflect.Sample;
import xyz.qkrwodn.aop1.SimpleStaticPointCut;
import xyz.qkrwodn.smallMart.advice.AfterLoggingAdvice;
import xyz.qkrwodn.smallMart.advice.AroundLoggingAdvice;
import xyz.qkrwodn.smallMart.advice.BeforeLoggingAdvice;
import xyz.qkrwodn.smallMart.advice.ThrowsLoggingAdvice;

// aspectj rt
// aspectj weaver

public class SmallMartApp {
	SmallMart mart;
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("smallmart4.xml");
		SmallMart proxy = ctx.getBean("smallMart",SmallMart.class);
		
		
		try {
			System.out.println("====== proxy ======");
			proxy.getProducts("칫솔");
			proxy.getProducts2("치실");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
