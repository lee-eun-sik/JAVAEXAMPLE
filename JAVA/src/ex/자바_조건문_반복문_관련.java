package ex;

import java.util.Scanner;

public class 자바_조건문_반복문_관련 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println("1부터"+" "+i+"까지의 합 :" +" "+(sum+=i));
		}
		System.out.println();
		int sum2=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("1부터"+" "+ i+"까지 짝수의 합 :" +" "+ (sum2+=i));
			}
		}
		System.out.println();
		
		for(int i=1; i<=10;i++) {
			System.out.println(i + " " +(11-i));
		}
		
		int alphabet = 65;
		char charValue = (char) alphabet;
		for(int i=0; i<26;i++) {
			charValue =(char) ((char)alphabet + i);
			System.out.print(charValue);
		}	
		
		System.out.println();
		
		for(int k=1; k<=9;k++) {
			System.out.println(k+"단");
			for(int j=1; j<=9;j++) {
				System.out.print(k+"*"+j+" " +"="+ (k*j)+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("현재 몸무게: ");
		int p = sc.nextInt();
		System.out.print("목표 몸무게: ");
		int g = sc.nextInt();
		int repeatValue= 50;
		int minusKG;
		for(int i=1; i<repeatValue;i++) {
			minusKG = p-i;
			System.out.println(minusKG);
			if(minusKG == g) {
				System.out.println("축하합니다. 목표몸무게까지 감량하셨습니다.");
				break;
			}
		}
	}

}
