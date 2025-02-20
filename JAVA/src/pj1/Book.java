package pj1;

public class Book {
	//책정보 (5가지이상)
	//가격
	private int bP;
	//제목
	private String bT;
	//내용
	private String bC;
	//작가
	private String bA;
	//카테고리
	private String bCr;
	
	//책정보(5가지이상) 담는 함수를 작성
	//책정보 내용, 제목
	/**
	 * 책정보 입력 함수
	 * @param bT 책제목
	 * @param bC책내용
	 */
	public void setBookInfo(String bT, String bC) {
		this.bT = bT;
		this.bC = bC;
	}
	//책정보 내용, 제목, 작가
	/**
	 * 책정보 입력 함수
	 * @param bT 책제목
	 * @param bC 책내용
	 * @param bA 작가
	 */
	public void setBookInfo(String bT, String bC, String bA) {
		setBookInfo(bT, bC);
		this.bA = bA;
	}
	
	//책정보 내용, 제목, 작가, 카테고리
	/**
	 * 
	 * @param bT 책제목
	 * @param bC 책내용
	 * @param bA 작가
	 * @param bCr 카테고리
	 */
	public void setBookInfo(String bT, String bC, String bA, String bCr) {
		setBookInfo(bT, bC, bA);
		this.bCr = bCr;
	}
	//책정보 내용, 제목, 작가, 카테고리, 가격
	/**
	 * 
	 * @param bT 책제목
	 * @param bC 책내용
	 * @param bA 작가
	 * @param bCr카테고리
	 * @param bP 책가격
	 */
	public void setBookInfo(String bT, String bC, String bA, String bCr, int bP) {
		setBookInfo(bT, bC, bA, bCr);
		this.bP = bP;
	}
	
	//책정보를 보여주는 함수를 작성
	public void bookInfoPrint() {
		if(bT!= null) {
			System.out.println("책제목 : "+bT);
		}
		if(bC!= null) {
			System.out.println("책내용 : "+bC);
		}
		if(bA!= null) {
			System.out.println("작가 : "+bA);
		}
		if(bCr!= null) {
			System.out.println("카테고리 : "+bCr);
		}
		if(bP != 0) {
			System.out.println("가격 : "+bP);
		}
	}
}
