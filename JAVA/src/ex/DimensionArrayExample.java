package ex;

public class DimensionArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DimensionArray DimArray= new DimensionArray();
		int[][]DimArray1 = DimArray.makeArray();
		
		for(int i=0;i<DimArray1.length;i++) {
			for(int j=0; j<DimArray1[i].length;j++) {
				System.out.println("["+i+"]"+" "+DimArray1[i][j]);
			}
		}
	}

}
