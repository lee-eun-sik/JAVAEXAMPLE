package pj1;

public class Cow {
//소 클래스
	//12 간지 문자형 null
	private String sexagenaryCycle;
	//순서 정수형 0
	private int order;
	//생태계 차지 퍼센트 실수형 0.0
	private double percent;
	//잡식 유무 논리형 false
	private boolean polyphagousCheck;
	//체중
	private int weight;
	/**
	 * 
	 * @param sexagenaryCycle 12 간지
	 * @param order 순서
	 * @param percent 생태계 차지 퍼센트
	 * @param polyphagousCheck 잡식 유무
	 * @param weight 체중
	 */
	public Cow(String sexagenaryCycle,
			int order,
			double percent,
			boolean polyphagousCheck,
			int weight
			) {
		// TODO Auto-generated constructor stub
		this.sexagenaryCycle = sexagenaryCycle;
		this.order = order;
		this.percent = percent;
		this.polyphagousCheck = polyphagousCheck;
		this.weight = weight;
	}
	/**
	 * 간지를 찍어주는 함수
	 * @param beforeSexagenaryCycle 이전 간지 정보
	 */
	public String printSexagenaryCycle(String beforeSexagenaryCycle) {
		System.out.println(beforeSexagenaryCycle+"->"+sexagenaryCycle);
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
