package chapter21;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//순서 있는 중복 제거 컬렉션 생성
		SequencedSet<String> nameSet = new LinkedHashSet<>();
		
		//첫 번째 요소로 저장
		nameSet.addFirst("김길동");
		nameSet.addFirst("김길동");
		nameSet.addFirst("이길동");
		
		//마지막 요소로 저장
		nameSet.addLast("탁길동");
		nameSet.addLast("홍길동");
		nameSet.addLast("홍길동");
		
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
