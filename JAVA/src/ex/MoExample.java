package ex;

public class MoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mo mo = new Mo();
		mo.setStr1(0);
		mo.setStr1("하나");
		mo.setStr1("하나",0);
		mo.setStr1("하나", 0, "둘");
		mo.getStr1();
		String mo1 = mo.getStr1();
		System.out.print(mo1);
	}

}
