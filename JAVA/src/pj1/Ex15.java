package pj1;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDay=31;
		int num = 3;
		//월 작성
		for(int i=1; i<=12;i++) {
			System.out.println(i+"월");
			System.out.print("일");
			System.out.print("월");
			System.out.print("화");
			System.out.print("수");
			System.out.print("목");
			System.out.print("금");
			System.out.println("토");
			//공백 찍음 전달 마지막 주 일수
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			//2월달
			if(i == 2) {
				lastDay = 28;
			}
			//짝수달
			else if(i%2 == 0) {
				lastDay = 30;
			}
			//홀수달
			else {
				lastDay = 31;
			}
			//일자 작성
			for(int k=1; k<=lastDay;k++) {
				System.out.print(" "+ k + " ");
				if((k+num)%7==0) {
					System.out.print("\n");
				}
			}
			//전달의 마지막주 일수
			num =(lastDay+num)%7;
			System.out.print("\n");
			
		}
	}

}
