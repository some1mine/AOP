package xyz.qkrwodn.aop3;

import lombok.Setter;

@Setter
public class MyBean {
	private MyDependency dependency;
	
	public void run(){
		dependency.hello();
		dependency.goodbye();
	}
	
}
