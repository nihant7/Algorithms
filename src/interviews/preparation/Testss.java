package interviews.preparation;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class Testss {
	public static int min(int[] arr) {
		int min  = arr[0];
		for(int i = 1; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	    public static void main(String args[] ) throws Exception {
	       
	    	 Scanner sc = new Scanner(System.in);
	    	 int t  = sc.nextInt();

	          
	          
	        while(t-- > 0){ 
		     int n = sc.nextInt();
		     int[] a = new int[n];
	         int[] b = new int[n];
	          int[] c = new int[n];
	         for(int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         
	         for(int j = 0; j < n; j++) {
	             b[j] = sc.nextInt();
	         }
	         
	         for(int k = 0; k < n; k++) {
	             c[k] = sc.nextInt();
	         }
	         
	         int minA = min(a), minB= min(b), minC= min(c);
	         
	         
	         
			int sum = minA + minB + minC;
	         System.out.println(sum);
	          
	          }

	    }
}
