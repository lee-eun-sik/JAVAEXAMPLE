package pj1;

import java.util.Scanner;

public class for문예제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게: ");
		
		int p = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int g = sc.nextInt();
		int minusKG;
		for(int i=0;i<g;i++) {
			System.out.println(minusKG=p-i);
			if(minusKG == g) {
				System.out.print("축하합니다. 목표몸무게까지 감량했습니다.");
				break;
			}
		}
		
	}

}
