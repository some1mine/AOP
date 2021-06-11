package xyz.qkrwodn.aop4;

import lombok.Setter;

@Setter
public class MyBean {
	private MyDependency dependency;
	
	public void run(){
		dependency.hello(5200);
		dependency.hello(4800);
		dependency.goodbye();
	}
	
}
