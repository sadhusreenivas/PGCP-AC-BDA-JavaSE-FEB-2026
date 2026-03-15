import java.util.*;
class ArrayOps{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int[] arr = new int[30];
		for(int i=0; i<arr.length; i++)
			arr[i] = 1 + (int) (Math.random()*1000); // 1- 1000
        
        int sum = 0;
		for(int x: arr){
			System.out.print(x+" ");
			sum = sum + x;
		}
		System.out.println("Sum: "+sum);
        double avg = (double)sum/arr.length;
        System.out.println(avg);

        //min / max logic
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
        	if(arr[i]>max)
        		max = arr[i];

        	if(arr[i]<min)
        		min = arr[i];
        }
        System.out.println("MAX: "+max+" MIN: "+min);
        // search case
       System.out.println("Enter an element to search");
       int searchItem = scanner.nextInt();
       boolean flag = false;

       for(int i=0; i<arr.length;i++){
       	if(arr[i] == searchItem){
       		System.out.println(searchItem+ " is found at index: "+i);
       		flag = true;
       		break;
       }
       }
       if(flag == false)
       System.out.println(searchItem+" is not found");

       //sort arr
       Arrays.sort(arr); // sorts ASC

       for(int x: arr){
			System.out.print(x+" ");
		}

	}
}