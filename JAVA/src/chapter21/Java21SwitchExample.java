package chapter21;

public class Java21SwitchExample {
	private static void method1(String s) {
		switch (s) {
			case null -> System.out.println("null");
			case "a", "b" -> System.out.println("a or b");
			case "c" -> System.out.println("unknown");
			default -> System.out.println("unknown");
		}
	}
	
	private static void method2(String s) {
		switch (s) {
			case "a", "b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			case null, default -> System.out.println("unknown");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(null);
		method2(null);
	}

}
