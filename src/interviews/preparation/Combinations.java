package interviews.preparation;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        int K = s.nextInt();            
	        int[] A = new int[N];
	        int even = 0;

	        for(int i = 0; i < N; i++) {
	            A[i] = s.nextInt();
	            if(A[i] % 2 == 0) { even++; }
	        }
	        
	        
	        int res = fact(even) / (fact(even-K) * fact(K)) ;
	        System.out.println(res);
	        


	    }
	   static int fact(int num) {
        if (num == 0 || num  == 1) return 1;
        else return num * fact(num-1);
    }   
	    
	}


