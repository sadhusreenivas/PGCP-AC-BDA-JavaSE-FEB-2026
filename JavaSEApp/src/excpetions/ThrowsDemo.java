package excpetions;
import java.io.*;
public class ThrowsDemo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Enter Name");
		String name = br.readLine();
		
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println(name + " "+ age);
		}
		catch(NumberFormatException e) {
			System.err.println(e);
		}
		finally {
			if(br != null)
				br.close();
			System.out.println("Resource closed");
		}
        System.out.println("rest of the code....");
	}

}
