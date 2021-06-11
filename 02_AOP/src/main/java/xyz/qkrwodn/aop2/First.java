package xyz.qkrwodn.aop2;

public class First {
	@AdviceRequired
	public void hello(){
		System.out.println("First.hello()");
	}
	public void sayHello(){
		System.out.println("First.sayHello()");
	}
}
