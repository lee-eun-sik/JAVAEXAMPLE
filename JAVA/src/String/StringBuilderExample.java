package String;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}

}
