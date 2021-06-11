package xyz.qkrwodn.proxy;

import java.lang.reflect.Proxy;

public class HelloWorldApp {
	public static void main(String[] args) {
		Class<?>[] arrClass = {HelloWorld.class};
		
		HelloWorldHandler handler = new HelloWorldHandler(new HelloWorldImpl());
		
		HelloWorld origin = new HelloWorldImpl();
		HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(HelloWorld.class.getClassLoader(), arrClass, handler);
		
		System.out.println("======= origin =======");
		System.out.println(origin.sayHello());
		System.out.println("======= proxy =======");
		System.out.println(proxy.sayHello()); // 어떤 객체가 필요할텐데?
		
		System.out.println(origin);
		System.out.println(proxy);
		
		// 1. 인터페이스를 통한 자동 프록시 객체 생성
		// 2. 상속을 통한 자동 프록시 객체 생성
	}
}
