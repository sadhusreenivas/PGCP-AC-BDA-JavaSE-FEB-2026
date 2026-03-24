package iostreams;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Person p1 = new Person("ABC",22, 1234_5678_9123L);
		System.out.println(p1);
		// serialization
		FileOutputStream fos = new FileOutputStream("C:/Users/CDAC/Desktop/Java-Samples/person.info");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		// de- serialization
		FileInputStream fis = new FileInputStream("C:/Users/CDAC/Desktop/Java-Samples/person.info");
		ObjectInputStream ois = new ObjectInputStream(fis);
	 	Person p2 = (Person) ois.readObject();
		
		System.out.println(p2);
	}
	

}
