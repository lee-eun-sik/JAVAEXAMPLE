package pj;

import pj1.MethodOverloading;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading Mo = new MethodOverloading();
		Mo.setStr1(0);
		Mo.setStr1("하나");
		Mo.setStr1("하나", 0);
		Mo.setStr1("하나", 0, "둘");
	}

}
