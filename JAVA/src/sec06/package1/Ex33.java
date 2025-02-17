package sec06.package1;

public class Ex33 {

	public Ex33() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdIf birdIf= new bird();
		BirdIfs BirdIfs = new bird();
		//birdIf.MAX_BIRD_NUM1 = 10;
		System.out.println(birdIf.MAX_BIRD_NUM1);
		System.out.println(birdIf.MAX_BIRD_NUM2);
		birdIf.eatPrint1();
		birdIf.eatPrint2();
		birdIf.eatPrint3();
		BirdIfs.eatPrint4();//자기가 강제시킨것만 호출, 여러개를 한꺼번에 한다.
		BirdIfs.eatPrint5();
		BirdIfs.eatPrint6();
		BirdIfs.eatPrint7();
		InstanceofExample instanceofExample = new InstanceofExample();
		instanceofExample.ifCPrint(birdIf);
		BirdIf.eatPrint8();
	}

}
