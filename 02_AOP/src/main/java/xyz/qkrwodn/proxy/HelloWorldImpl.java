package xyz.qkrwodn.proxy;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello() {
		System.out.println("μλ μΈμ");
		return "Hello World";
	}
	
}
