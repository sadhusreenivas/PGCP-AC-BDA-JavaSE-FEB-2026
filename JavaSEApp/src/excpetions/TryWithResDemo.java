package excpetions;
import java.io.*;

public class TryWithResDemo {
	public static void main(String[] args) throws IOException{
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			String name= br.readLine();
			System.out.println("Hi "+name);
			}
//		    catch(IOException e){
//			System.out.println(e);
	//}
		// finally is not required 
}
}
