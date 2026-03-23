package iostreams;
import java.io.*;
public class FRDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/CDAC/Desktop/Java-Samples/abc.txt");
		FileWriter fw = new FileWriter("C:/Users/CDAC/Desktop/Java-Samples/xyz.txt");
		int ch;
		
		while( (ch = fr.read()) != -1 ) {  // // EOF = -1 => read()
			System.out.print((char)ch);
			fw.write(ch);
		}
       
		fr.close();
		fw.close();
		
		System.out.println("\n\n file written into xyz file on desktop");
	}

}
