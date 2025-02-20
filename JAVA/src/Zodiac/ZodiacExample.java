package Zodiac;

public class ZodiacExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자 생성
		Mouse mouse = new Mouse("자", 1, 0.01, true, 2);
		Cow cow = new Cow("축", 2, 0.01, false, 709);
		Tiger tiger = new Tiger("인", 3, 0.089, false , true);
		Rabbit rabbit = new Rabbit("묘", 4, 0.0007, false, 8);
		Dragon dragon = new Dragon("진", 5, 0, true, true);
		Snake snake = new Snake("사", 6, 0.035, false, true);
		Horse horse = new Horse("오", 7, 0.1, false, 45);
		Sheep sheep = new Sheep("미", 8, 0.1, false, true);
		Monkey monkey = new Monkey("신", 9, 0.00001, true, true);
		Chicken chicken = new Chicken("유", 10, 0.00000001, true, true);
		Dog dog = new Dog("술", 11, 0.000001, true, true);
		Pig pig = new Pig("해", 12, 0.000000001, true, true);
		
		pig.printSexagenaryCycle(
				dog.printSexagenaryCycle(
					chicken.printSexagenaryCycle(		
						monkey.printSexagenaryCycle(
							sheep.printSexagenaryCycle(
								horse.printSexagenaryCycle(
									snake.printSexagenaryCycle(
										dragon.printSexagenaryCycle(
											rabbit.printSexagenaryCycle(
												tiger.printSexagenaryCycle(
													cow.printSexagenaryCycle(
														mouse.getSexagenaryCycle())))))))))));
		pig.printOrder(
			dog.printOrder(
				chicken.printOrder(
					monkey.printOrder(
						sheep.printOrder(
							horse.printOrder(
								snake.printOrder(
									dragon.printOrder(
										rabbit.printOrder(
											tiger.printOrder(
												cow.printOrder(
													mouse.getOrder()))))))))))); //값 넘겨주고 찍어줌 자기것을 넘겨줌.
	}
	
}
