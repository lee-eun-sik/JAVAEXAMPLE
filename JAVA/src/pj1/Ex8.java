package pj1;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10";
		byte value = Byte.parseByte(str);
		String str1 = "200";
		short value1 = Short.parseShort(str1);
		String str2 = "300000";
		int value2 = Integer.parseInt(str2);
		String str3 = "40000000000";
		long value3 = Long.parseLong(str3);
		String str4 = "12.345";
		float value4 = Float.parseFloat(str4);
		String str5 = "12.345";
		double value5 = Double.parseDouble(str5);
		String str6 = "true";
		boolean value6 = Boolean.parseBoolean(str6);
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
	}

}
