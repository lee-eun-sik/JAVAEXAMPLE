package reflection;

public class GetResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car2.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}	

}
