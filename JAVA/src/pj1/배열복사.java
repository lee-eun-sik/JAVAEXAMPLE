package pj1;

public class 배열복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oStr = {"a", "b", "c"};
		String[] nStr = new String[5];//null이 다 들어감
		//매개변수 설명
		//복사 배열, 복사 배열 시작 인덱스, 넣을 배열, 넣을배열 시작인덱스, 복사배열의 크기
		System.arraycopy(oStr, 0, nStr, 1, oStr.length);
		for (int i = 0; i < nStr.length;i++) {
			System.out.println("nStr"+(i+1)+" : "+nStr[i]);
		}
		//열거형
		Week w = Week.Mon;
		System.out.println(Week.Mon.getLabel());
		System.out.println(Week.Mon.getCode());
		System.out.println(Week.Tue.getLabel());
		System.out.println(Week.Tue.getCode());
	}

}
