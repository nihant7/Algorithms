package interviews.preparation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
class TestClass {
    
    protected static int divs(Integer m, Integer n) {
    	
    	Integer len = Math.min(m, n);
    	Integer count = 0; 
    	for(int i = 1; i <= len; i++) {
            if(m % i == 0 && n % i == 0) ++count;
        }
       
        return count;
    }
    
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
        //Scanner
    	
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();                 // Reading input from STDIN
        int n2 = s.nextInt();
        int count = divs(n1, n2);
        System.out.println(count);
    }
}
