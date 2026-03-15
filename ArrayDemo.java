class ArrayDemo{
	public static void main(String[] args) {
		
		int[] arr = new int[10];
        System.out.println("Size of arr :"+arr.length);

        String[] courses = {"AC", "BDA", "ASSD", "VLSI", "ESD", "ITISS"};

        // populating array using random nos
        for(int i=0; i<arr.length; i++)
        	arr[i] = 1 + (int) (Math.random()*10); // 1- 10

        // Reading arr
        for(int i=0; i<arr.length; i++)
        	System.out.println(i+" -> "+ arr[i]);

        // for each
        for( int x : arr)
        	System.out.println(x);

         System.out.println("************************");
        // Reading course
        for(int i=0; i<courses.length; i++)
        	System.out.println(i+" -> "+ courses[i]);

        // for each
        for(String s : courses)
        	System.out.println(s);


	}
}