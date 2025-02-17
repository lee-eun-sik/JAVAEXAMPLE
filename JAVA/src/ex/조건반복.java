package ex;

public class 조건반복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		if(score>= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		int score1 =85;
		
		if(score1 >=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		int score2 = 75;
		
		if(score2 >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score2>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score2>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		int num = (int) (Math.random()*6) + 1;
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
		
		int score3 = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score3);
		
		String grade;
		
		if(score3>=100) {
			if(score3>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score3>=85) {
				grade= "B+";
			} else {
				grade="B";
			}
		}
		System.out.println("학점: " + grade);
		
		int num6 = (int) (Math.random()*6) + 1;
		
		switch(num6) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
		}
		
		int time = (int) (Math.random()*4) + 8;
		System.out.println("[현재 시간 : " + time + "시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 봅니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
		
		char grade1 = 'B';
		switch(grade1) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손닙입니다.");
		}
		
		char grade2 = 'B';
		
		switch(grade2) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}
		
		switch(grade2) {
			case 'A', 'a' -> System.out.println("우수 회원입니다.");
			case 'B', 'b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("손님입니다.");
		}
		
		String grade3 = "B";
		//Java 11 이전 문법
		int score4 = 0;
		switch(grade3) {
			case "A":
				score4 = 100;
				break;
			case "B":
				int result = 100-20;
				score4 = result;
				break;
			default:
				score4 = 60;
		}
		System.out.println("score4: " + score4);
		
		//Java 13부터 가능
		int score5 = switch(grade3) {
			case "A" -> 100;
			case "B" -> {
				int result = 100-20;
				yield result;
			}
			default ->60;
		};
		System.out.println("score5: " + score5);
		
		int sum_1 = 0;
		sum_1 = sum_1 +1;
		sum_1 = sum_1 +2;
		sum_1 = sum_1 +3;
		sum_1 = sum_1 +4;
		sum_1 = sum_1 +5;
		System.out.println("1~5까지의 합:" + sum_1);
		
		int sum_2 = 0;
		for (int i=1; i<=100; i++) {
			sum_2 = sum_2+i;
		}
		System.out.println("1~100까지의 합:" + sum_2);
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		int sum_3=0;
		int i;
		
		for (i=1; i<=100;i++) {
			sum_3 += i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum_3);
		
		for(float x=0.1f; x<=1.0f;x+=0.1f) {
			System.out.println(x);
		}
		
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
		int k = 1;
		while (k<=10) { 
			System.out.print(k + " ");
			k++;
		}
	
		int sum_4 = 0;
		
		int j = 1;
		while(j<=100) {
			sum_4 += j;
			j++;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum_4);
	}
}
