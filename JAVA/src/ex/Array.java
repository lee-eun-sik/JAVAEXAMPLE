package ex;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ab = {{1,2},{3,4}};
		for(int[] i:ab) {
			System.out.println(i);
			for(int j: i) {
				System.out.println(j);
			}
		}
		System.out.println(Week.Mon.lable);
		System.out.println(Week.Mon.code);
	}

}
