package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List 컬렉션 생성
		List<Student2> studentList = new ArrayList<>();
		studentList.add(new Student2("홍길동", 30));
		studentList.add(new Student2("신용권", 10));
		studentList.add(new Student2("유미선", 20));
		
		//점수를 기존으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
