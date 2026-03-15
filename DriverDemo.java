class DriverDemo{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int x = n;
		int sum = 0;

		while(n > 0){
			int d = n % 10;
			sum = sum + Main.factorial(d);
			n = n / 10;
		}
    
       if(sum == x)
       	System.out.println(x+ " is strong number");
       else
       	System.out.println(x+" is not strong number");
	}
}