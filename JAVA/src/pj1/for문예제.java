package pj1;

import java.util.Scanner;

public class for문예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		int sum=0;
		
		for(int i=1; i<=num;i++) {
			sum+=i;
			System.out.print("1부터 10까지 더한 값:"+sum+"\n");
			
		}
		int sum1=0;
		for(int i=1; i<=num;i++) {
			if(i%2==0) {
				sum1+=i;
				System.out.println(sum1);
			}
		}
	}

	

}
