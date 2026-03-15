class Driver{
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int sum = 0;

		while(n > 0){

			int d = n % 10;
			sum = sum + d; 
			n = n / 10;
		}

       System.out.println(" Sum of the digits of "+n+" is "+sum);
	}
}