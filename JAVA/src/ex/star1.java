package ex;

public class star1 {
	public star1() {
		System.out.println("생성자 호출");
	}
	/**
	 * 직각심각형 프린트하는 함수
	 * @param num 직각삼각형의 크기
	 */
	public void printTriangle(int num) {
		
		for (int i=0; i<num; i++) {
			//i의 갯수만큼 출력
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			//별을 다찍은 후에 개행
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * 뒤집힌 직삼각형을 프린트하는 함수
	 * @param num 직삼각형의 크기
	 */
	public void printReverseTriangle(int num) {
		//******
		//*****
		//****
		//***
		//**
		//*
		for(int i=0; i<num;i++) {
			for(int j=0; j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//          *
	//		   **
	//        ***
	//       ****
	//      *****
	//     ******
	public void triangle3 (int num) {
		for(int i=0; i<num;i++) {
			for(int j = 1; j<num-i;j++) {
				System.out.print(" ");
			}
			for(int k=num-i;k<=num;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//			*
	//		   ***
	// 		  *****
	//		 *******
	//		*********
	//	   ***********
	
	public void isoscele_triangle(int num) {
		for(int i=0; i<num;i++) {
			for(int j=1; j<=(num-i)-1;j++) {
				System.out.print(" ");
			}
			for(int k=(2*num)-2*i-1; k<=(2*num)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// ***********
	//  *********
	//   *******
	//    *****
	//     ***
	//      *
	
	public void triangle4(int num) {
		for(int i = 0;i<num; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*num)-2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void Star(int num) {
		for(int i = 0; i<num;i++) {
			for(int j = 3*num-i-1; j>=2;j--) {
				System.out.print(" ");
			}
			for(int k=(2*num)-2*i-1; k<=(2*num)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<(6*num)-2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<num-1;i++) {
			for(int j=0; j<=num-3-i;j++) {
				System.out.print(" ");
			}
			for(int k=num+3-2*i;k<(6*num)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<num;i++) {
			for(int j=num-i; j<(3*num)-1;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*num)-2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
