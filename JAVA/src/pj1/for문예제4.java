package pj1;

public class for문예제4 {
	static int alphabet= 65;
	static char charValue = (char) alphabet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<26;i++ ) {
			charValue=(char) ((char)+alphabet+i);
			System.out.print(charValue);
		}
	}

}
