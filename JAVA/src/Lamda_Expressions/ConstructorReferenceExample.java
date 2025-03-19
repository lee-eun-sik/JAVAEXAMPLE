package Lamda_Expressions;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person5 person = new Person5();
		
		Member m1 = person.getMember1(Member :: new);
		System.out.println(m1);
		System.out.println();
		
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}

}
