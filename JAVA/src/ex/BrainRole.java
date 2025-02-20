package ex;

public class BrainRole {
	public void function(Brain brain) {
		System.out.println("뇌의 구조 이름"+brain.getName() + brain.getFunction()+brain.getSimilarity());
		brain.function();
	}
}
