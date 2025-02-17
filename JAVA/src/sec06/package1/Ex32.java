package sec06.package1;

public class Ex32 {

	public Ex32() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bird bird = new Penguin("펭권", "3", "믈고기");//부모는 자식을 받기 가능 부모가 자식의 주소값 가짐.
		Penguin punguin = new Penguin("펭귄", "3", "물고기");
		
		bird birdH = new Humming("벌새", "1", "벌꿀");
		bird birdP = new Penguin("펭귄", "3", "물고기");
		//bird bird = new bird()''
		//System.out.println(bird.getClass().getName());
		
		Penguin penguin = (Penguin) bird; //자식은 부모를 받을 수 있냐? 있다! 강제로 형변환하기 다른 클래스 사이에서 똑같다.
		Humming humming = (Humming) birdH;
		
		System.out.println("Humming ? "+(birdH instanceof Humming));
		System.out.println("Humming ? "+(bird instanceof Humming));
		System.out.println("Humming ? "+(bird instanceof Penguin));
		System.out.println(penguin.toString());
		System.out.println(humming.toString());
		
		InstanceofExample instanceofExample = new InstanceofExample();
		instanceofExample.birdCprint(birdH); //형태가 맞아야함
	
		instanceofExample.birdCprint(birdP);
		String str = "문자";
		int int1 = 0;
		double d = 0.0; // 모든 변수는 포인터를 하고 있다.
		System.out.println((str instanceof String));
		System.out.println(((Integer)int1 instanceof Integer));// 강제캐스팅하기
		System.out.println((Double)d instanceof Double);// 메모리상에 객체 형태로 저장
	}

}
