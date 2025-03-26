package Stream;

import java.util.Arrays;
import java.util.List;

public class RedutionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student4> studentList = Arrays.asList(
				new Student4("홍길동", 92),
				new Student4("신용권", 95),
				new Student4("김자바", 88)
		);
		//방법1
		int sum1 = studentList.stream()
					.mapToInt(Student4 :: getScore)
					.sum();
		//방법2
		int sum2 = studentList.stream()
					.map(Student4 :: getScore)
					.reduce(0, (a, b) -> a+b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
	}

}
