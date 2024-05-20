package basicJava;

public class ShifZeroONLast {
	
	
	public static void main(String[] args) {
		
		int temp =0;
		int ar[] = {1,3,0,4,6,33,0};
		
		  for (int i = 0; i < ar.length; i++) {
			  
			  
			     if (ar[i]==0) {
					
			    	   temp = ar[i];
			    	   
			    	   ar[i] = ar[i+1];
			    	   
			    	   ar[i+1] =temp;
				}
		}
		  
	
	}

}
