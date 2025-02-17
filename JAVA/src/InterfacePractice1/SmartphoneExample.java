package InterfacePractice1;

public class SmartphoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스마트폰, 태블릿, 보안 카메라 객체 생성
		
		SmartDevice phone = new Smartphone();
		SmartDevice tablet = new Tablet();
		SmartDevice camera = new SecurityCamera();
		
		// DeviceManager를 이용한 실행
		System.out.println("=== DeviceManager 실행 ===");
		
		DeviceManager manager1 = new DeviceManager(phone);
		manager1.startDevice();
		manager1.stopDevice();
		
		DeviceManager manager2 = new DeviceManager(tablet);
		manager2.startDevice();
		manager2.stopDevice();
		
		DeviceManager manager3 = new DeviceManager(camera);
		manager3.startDevice();
		manager3.stopDevice();
		
		//DeviceController를 이용한 실행
		System.out.println("=== DeviceController 실행 ===");
		DeviceController controller = new DeviceController();
		controller.operateDevice(phone);
		controller.operateDevice(tablet);
		controller.operateDevice(camera);
	}

	

}
