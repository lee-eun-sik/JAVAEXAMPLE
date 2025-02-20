package pj1;

public class birdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parrot p = new parrot("앵무새", "암컷", "뉴질랜드", "초록색", "맹금류", "15만원");
		parrot p1 = new parrot("앵무새", "암컷", "초록색", "맹금류");
		bird b = new bird("앵무새");
		System.out.println(p.ParrotString());
		System.out.println("b:"+b);
		System.out.println("p:"+p);
		//부모가 아는것 + 오버라이딩 한것만 사용가능 -> 내가 상속한것만 사용가능
		b.eat();
		p.eat();
		
	}

}
