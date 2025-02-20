package ex;

public class DimensionArray {

	public DimensionArray() {
		
	}
	
	public int[][] makeArray() {
		//2차원 배열 선언
		//데이터타입 정수형 데이타 2차원배열
		//0~99까지 수를 2차원 배열에 넣고 출력
		//[10][10]
		//[0] 0~9
		//[1] 10 ~ 19
		//[2] 20 ~ 29
		
		//int[][] array = {{1,2},{3,4}};
		int[][] array1 = new int[10][20];
		for(int i = 0; i < array1.length;i++) {
			//10번
			for(int j=0; j<array1[i].length;j++) {
				array1[i][j] = (j)+(20*i);
			}
		}
		return array1;
	}
}
