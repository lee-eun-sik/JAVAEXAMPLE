package inheritance;


public class StudentExample {
	/**
	 * 자바 실행함수
	 * @param args 실행할 때 입력값들
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Human h = new Human("이름", "25", "남성");
		Student st1 = new Student("이름", "25", "남성");
		System.out.println(st1.studentString());
		st.eat();
		h.eat();
		System.out.println("st1:"+st1);
		System.out.println("h:"+h);
	}

}
