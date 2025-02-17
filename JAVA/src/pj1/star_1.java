package pj1;

public class star_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		for(int i = 0; i<num;i++) {
			for(int j = 3*num-i-1;j>=2;j--) {
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
	}

}
