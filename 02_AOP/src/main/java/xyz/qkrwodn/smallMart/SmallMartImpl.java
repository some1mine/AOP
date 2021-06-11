package xyz.qkrwodn.smallMart;

public class SmallMartImpl implements SmallMart{

	@Override
	public void getProducts(String productName) throws Exception {
		System.out.println(productName);
//		throw new Exception("small mart 예외");
	}

}
