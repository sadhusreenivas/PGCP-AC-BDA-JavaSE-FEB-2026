// >=80 - A+, >=70 - A, >=60 - B  >=50 - C - >=40 - D <FAIL
class Test{
	public static void main(String[] args) {
    int monthNo = Integer.parseInt(args[0]); // for 100

    switch(monthNo){
    	case 11:
    	case 12:
    	case 1:
    	case 2: System.out.println("Winter");
    		    // break
    	case 3:
    	case 4:
    	case 5:
    	case 6: System.out.println("Summer"); break;
    	case 7: 
    	case 8:
    	case 9:
    	case 10: System.out.println("Rainy"); break;

    	default: System.out.println(" Enter a valid month no");
    }
    
}
}
