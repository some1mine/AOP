package xyz.qkrwodn.smallMart5;

import org.springframework.stereotype.Service;

@Service("smallMart")
public class SmallMartImpl implements SmallMart{

	@Override
	public void getProducts(String productName) throws Exception {
		System.out.println(productName + ":: getProducts()");
//		throw new Exception("small mart 예외");
	}
	@Override
	public void getProducts2(String productName) throws Exception {
		System.out.println(productName + ":: getProducts2()");
//		throw new Exception("small mart 예외");
	}

}
