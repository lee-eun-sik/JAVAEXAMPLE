package chapter21;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class DefaultCharsetExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//자바 기본 문자셋 확인
		Charset javaCharset = Charset.defaultCharset();
		System.out.println("Java 기본 문자셋: " + javaCharset.toString());
		
		//한글을 byte[] 배열로 변환할 때의 한 글자당 바이트 수 확인
		byte[] bytes = "자바".getBytes();
		System.out.println("바이트 수: " + bytes.length + " bytes");
		
		//한글을 파일에 저장할 때의 한 글자당 바이트 수 확인
		File file = new File("C:\\Users\\dldms\\file.txt");
		FileWriter writer = new FileWriter(file);
		writer.write("한글");
		writer.flush();
		writer.close();
		System.out.println("file size: " + file.length() + " bytes");
	}

}
