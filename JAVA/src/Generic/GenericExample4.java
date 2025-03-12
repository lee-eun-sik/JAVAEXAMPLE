package Generic;

public class GenericExample4 {

	//제네릭 메소드
	public static <T> Box1<T> boxing(T t) {
		Box1<T> box = new Box1<T>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭 메소드 호출
		Box1<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		//제네릭 메소드 호출
		Box1<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
