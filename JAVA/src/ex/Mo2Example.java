package ex;

public class Mo2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mo2.setStr2("문자2");
		System.out.println("Mo2.str2 : "+Mo2.str2);
		Mo2.setStr2("문자3");
		System.out.println("Mo2.str3 : "+Mo2.str2);
		Mo2.setStr3("문자3", "문자2");
		System.out.println("Mo2.str3 : "+Mo2.str3);
		Mo2 m = new Mo2(); //다른점: 인스턴스를 만들었다.
		System.out.println("Mo2.str2 : " +m.str2);//최종값 유지된다. 문자를 객체에 초기화 null, Mo2와 상관없다, 정적 멤버들은 공유가 된다.
		m.setStr1(0, "문자1");
	}

}
