package pj1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class for문예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for(int i=1;i<num;i++) {
			System.out.println(i+"단");
			for(int j=1; j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j + " ");
				
			}
			System.out.println();
		}
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
	}

}
