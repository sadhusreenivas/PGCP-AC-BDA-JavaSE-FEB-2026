class ArraysOfArrays{
	
	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];

		// populate arr
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = 1 + (int)(Math.random()*9);
			}
		}

		// printing arr
		for(int i=0; i<arr.length; i++){
			System.out.println();
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
			}
		}

		// sum of diagonal elements
		int sum = 0;
        for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(i==j)
					sum = sum + arr[i][j];
			}
		}

       System.out.println("\nSum: "+sum);


	}
}