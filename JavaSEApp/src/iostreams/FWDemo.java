package iostreams;
import java.io.*;
public class FWDemo {

	public static void main(String[] args) throws IOException {
		
		// File file = new File("C:/Users/CDAC/Desktop/Java-Samples/abc.txt");
		
		FileWriter fw = new FileWriter("C:/Users/CDAC/Desktop/Java-Samples/abc.txt", true); // append = true
		
		fw.write("Java is OOP language\nJava is robust\n");
		fw.write("Java is secure\nJava is platform independent\n");
		fw.write("Java is compiled and interpreted\nJava is distributed\nJava give high performance\n");
	    
		fw.close();
		
		System.out.println("File written successfully!");
	}

}
