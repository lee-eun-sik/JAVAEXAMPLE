package chapter21;

public class PlatformThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전통식 방식
		Thread platformThread1 = new Thread(() -> {
			System.out.println("platformThread1 실행: ");
		});
		platformThread1.start();
		
		//자바 21
		Thread.ofPlatform()
			.start(() -> {
				System.out.println("platformThread2 실행: ");
			});
		
		//자바 21
		Thread.ofPlatform()
			.name("copyThread")
			.start(() -> {
				System.out.println("platformThread3 실행: ");
			});
		
		//자바 21
		Thread platformThread4 = Thread.ofPlatform()
				.name("downloadThread")
				.daemon()
				.start(() -> {
					System.out.println("platformThread4 실행: ");
				});
		System.out.println("platformThread4 이름: " + platformThread4.getName());
	}

}
