package iostreams;
import java.io.*;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("C:/Users/CDAC/Desktop/Java-Samples/qwerty.data");
		String str = "Java is my favourite programming Language!";
		byte[] bytes = str.getBytes();
		fos.write(bytes);
		
		FileInputStream fis = new FileInputStream("C:/Users/CDAC/Desktop/Java-Samples/qwerty.data");
		int i;
		
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}

		fos.close();
		fis.close();
		
	}

}
