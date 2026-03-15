class Pattern{
	public static void main(String[] args) {
        int s = 10;
		for(int i=1; i<=5; i++){
             
            // manage spaces
            for(int k=1; k<=s; k++)
 				System.out.print(" ");

			for(int j=1; j<=i; j++)
			System.out.print(" *  ");

		System.out.println();
		s = s - 2;
	}

         s = 4;
		for(int i=4; i>=1; i--){
             
            // manage spaces
            for(int k=1; k<=s; k++)
 				System.out.print(" ");

			for(int j=1; j<=i; j++)
			System.out.print(" *  ");

		System.out.println();
		s = s + 2;
	}

	

	}
}