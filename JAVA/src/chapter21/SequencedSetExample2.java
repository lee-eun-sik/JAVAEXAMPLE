package chapter21;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SequencedSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//순서 있는 중복 제거 컬렉션 생성
		SequencedSet<String> nameSet = new TreeSet<>();
		
		//첫 번째 요소로 저장
		//nameSet.addFirst("이길동"); //예외 발생
		
		//마지막 오소로 저장
		//nameSet.addLast("탁길동"); //예외 발생
		
		//요소 저장
		nameSet.add("김길동");
		nameSet.add("이길동");
		nameSet.add("김길동");
		nameSet.add("홍길동");
		nameSet.add("탁길동");
		nameSet.add("홍길동");
		
		//첫 번째 요소 제거
		nameSet.removeFirst();
		
		//마지막 요소 제거
		nameSet.removeLast();
		
		//요소 출력
		System.out.println(nameSet.toString());
		
		//요소의 순서를 뒤바꾸기
		nameSet = nameSet.reversed();
		
		//요소 출력
		System.out.println(nameSet.toString());
	}

}
