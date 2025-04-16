package chapter21;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//순서 있는 중복 허용 컬렉션 생성
		SequencedCollection<String> nameList = new ArrayList<>();
		
		//첫 번째 요소로 저장
		nameList.addFirst("김길동");
		nameList.addFirst("박길동");
		nameList.addFirst("이길동");
		
		//마지막 요소로 저장
		nameList.addLast("조길동");
		nameList.addLast("탁길동");
		nameList.addLast("홍길동");
		
		//첫 번째 요소 제거
		nameList.removeFirst();
		
		//마지막 요소 제거
		nameList.removeLast();
		
		//요소 출력
		System.out.println(nameList.toString());
		
		//요소의 순서를 뒤바꾸기
		nameList = nameList.reversed();
		
		//요소 출력
		System.out.println(nameList.toString());
	}

}
