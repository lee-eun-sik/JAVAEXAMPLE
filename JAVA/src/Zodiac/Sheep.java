package Zodiac;

public class Sheep {
	//12 간지 문자형 null
		private String sexagenaryCycle;
		//순서 정수형 0
		private int order;
		//생태계 차지 퍼센트 실수형 0.0
		private double percent;
		//잡식 유무 논리형 false
		private boolean polyphagousCheck;
		//양털 사용 유무
		private boolean woolUseCheck;
		public Sheep(
				String sexagenaryCycle,
				int order,
				double percent,
				boolean polyphagousCheck,
				boolean woolUseCheck
				) {
			// TODO Auto-generated constructor stub
			this.sexagenaryCycle = sexagenaryCycle;
			this.order = order;
			this.percent = percent;
			this.polyphagousCheck = polyphagousCheck;
			this.woolUseCheck = woolUseCheck;
		}
		/**
		 * 간지를 쩍어주는 함수
		 * @param beforeSexagenaryCycle 이전 간지 정보
		 * @return
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
