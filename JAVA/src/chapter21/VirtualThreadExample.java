package chapter21;

public class VirtualThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바 21: 방법1
		Thread.startVirtualThread(() -> {
			System.out.println("virthalThread1 실행");
		});
		
		//자바 21: 방법2
		Thread.ofVirtual()
			.start(() -> {
				System.out.println("virtualThread2 실행");
			});
		
		//자바 21: 스레드 이름 설정
		Thread virtualThread3 = Thread.ofVirtual()
				.name("downloadThread")
				.start(() -> {
					System.out.println("virtualThread3 실행 ");
				});
		System.out.println("virtualThread3 이름: " + virtualThread3.getName());
	}

}
