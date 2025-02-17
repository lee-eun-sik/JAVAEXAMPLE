package Zodiac;

public class Tiger {
	//12 간지 문자형 null
	private String sexagenaryCycle;
	//순서 정수형 0
	private int order;
	//생태계 차지 퍼센트 실수형 0.0
	private double percent;
	//잡식유무 논리형 초기화값 false
	private boolean polyphagousCheck; // false
	//수영 가능 유무 false
	private boolean swimCheck;
		
	public Tiger(String sexagenaryCycle,
				int order,
				double percent,
				boolean polyphagousCheck,
				boolean swimCheck
				) {
		// TODO Auto-generated constructor stub
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphagousCheck = polyphagousCheck;
		this.swimCheck = swimCheck;
	}
	/**
		* 간지를 찍어주는 함수
		* @param beforeSexageneryCycle 이전 간지 정보
	*/
	public String printSexagenaryCycle(String beforeSexageneryCycle) {
		System.out.println(beforeSexageneryCycle+"->"+sexagenaryCycle);
		return sexagenaryCycle;
	}
		
	/**
	 	* 순서를 찍어주는 함수
		* @param beforeOrder 이전 순서 정보
	*/
	public int printOrder(int beforeOrder) {
		System.out.println(beforeOrder+"->"+order);
		return order;
	}
}
