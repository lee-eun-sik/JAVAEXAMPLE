package chapter18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("C:\\Users\\dldms\\test3.db");
			
			byte[] array = { 10, 20, 30, 40, 50 };
			
			os.write(array, 1, 3);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
