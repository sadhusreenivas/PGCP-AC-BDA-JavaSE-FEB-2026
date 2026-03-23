package excpetions;

public class VotingApp {

	public static void vote(int age) throws InvalidAgeException {
		if(age >=18)
			System.out.println("Welcome to Vote!");
		else
			throw new InvalidAgeException("under 18 - invalid age");
	}
	
	
	public static void main(String[] args) {
		try {
		vote(19); // 
		vote(17); // ?
		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		finally {
			System.out.println("Finally always gets executed!");
		}
        System.out.println("rest of the code follows.......");
	}

}
