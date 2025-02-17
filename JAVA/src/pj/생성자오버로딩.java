package pj;

import pj1.Cons;

public class 생성자오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons cs = new Cons();
		Cons cs0 = new Cons(1);
		Cons cs1 = new Cons("하나");
		Cons cs2 = new Cons("하나", "둘");
		Cons cs3 = new Cons("하나", "둘", "셋");
	}

}
