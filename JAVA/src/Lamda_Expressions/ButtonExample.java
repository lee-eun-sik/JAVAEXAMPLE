package Lamda_Expressions;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ok 버튼 객체 생성
		Button btnOk = new Button();
		
		//Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체 생성
		Button btnCancel =new Button();
		
		//Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체)주입
		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
	}

}
