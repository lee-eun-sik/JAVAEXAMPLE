package ex;

public class Computer1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator3 calculator = new Calculator3();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer1 computer = new Computer1();
		System.out.println("원 면적: " + computer.areaCircle(r));
	}

}
