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
class Tests {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
      
        Scanner n2 = new Scanner(System.in);
        int num1 = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        
        
        int[] ar = new int[num1];
       for(int k = 0; k < ar.length; k++) {
    	   ar[k] = n3.nextInt();
       }
        
        
      for(int j = 0; j < ar.length; j++) { 
       for(int i = 1; i <= ar[j]; i++) {
            if(i%15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0) {
                System.out.println("Fizz");
            }
            else if(i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
            	System.out.println(i);
            }
        }
      }
    
    }
}

