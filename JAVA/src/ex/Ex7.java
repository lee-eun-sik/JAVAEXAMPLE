package ex;

public class Ex7 {
	/**
	 * 자바 실행함수
	 * @param args 실행할 때 입력값들
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형
		byte bv = 10;
		int iv = bv;
		long lv = iv;
		//실수형
		float fv = lv;
		double dv = fv;
		//일반 데이터 넣을 시
		long lv1 = 100l;
		float fv1 = 100f;
		System.out.println("bv :"+10);
		System.out.println("iv :"+iv);
		System.out.println("lv :"+lv);
		System.out.println("fv :"+fv);
		System.out.println("dv :"+dv);
		System.out.println("lv1 :"+lv1);
		System.out.println("fv1 :"+fv1);
		dv = 63.1234;
		bv = (byte)dv;
		System.out.println("bv :"+bv);
	}

}
