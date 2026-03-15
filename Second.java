import java.util.Scanner;
class Second{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        // reading a character 

        System.out.println("Enter a character");
        
        char ch = scanner.next().charAt(0); // "x" => 'x'

        System.out.println(ch + 1);


	}

}