package chapter18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class WriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("C:/Users/Admin/text1.db");
			
		
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
