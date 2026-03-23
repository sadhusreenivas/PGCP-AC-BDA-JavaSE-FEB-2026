package iostreams;
import java.io.*;
public class BRDemo {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("C:/Users/CDAC/Desktop/Java-Samples/asdf.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/CDAC/Desktop/Java-Samples/abc.txt"));
		
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			bw.write(line); // asdf.txt
			line = br.readLine();
			
		}
		
		bw.close();
		br.close();
		
	}
}
