package chapter18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C://Users/dldms/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//기본 타입 출력
		dos.writeUTF("홏길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		//DataInputStream 생성
		FileInputStream fis = new FileInputStream("C:/Users/dldms/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		//컨이 부족
		for(int i=0; i<2; i++) {
			String name =  dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close(); fis.close();
	}

}
