package team.hw;

public class Repl {
	
	public static final double avgElements(int [] a) {
		double total = 0;

        for(int i=0; i<a.length; i++){
        	total = total + a[i];
        }
        return total / a.length;	
	
        
	}
	public static void main(String[] args) { 
		
		int[] a = {2,7,3,8,4};
		
		System.out.println(avgElements(a)); //should print 4.8	
	}
	
        
	}




	 
	
	

	


	
	


		
	


