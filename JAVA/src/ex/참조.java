package ex;

import java.util.ArrayList;
import java.util.List;

public class 참조 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();// 출처를 밝혀야됨
		java.util.List l1 = new java.util.ArrayList();//출처밝히기
		boolean a = true;
		boolean b = false;
		a &= b;
		System.out.println("a :"+a);
		a = a&b;
		System.out.println("a :"+a);
		a = a^b;
		System.out.println("a :"+a);
		
		String str1 = "최재길";
		String str2 = "최재길";
		String str3 = new String("최재길");
		System.out.println((str1==str2));//true
		System.out.println((str1==str3));//false
		System.out.println((str1.equals(str3)));
	}

}
