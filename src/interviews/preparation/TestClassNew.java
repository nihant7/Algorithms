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

class TestClassNew {
    public static void main(String args[] )  {
    
      // Write your code here
      //Scanner
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();                 // Reading input from STDIN
      ArrayList<Integer> al = new ArrayList<Integer>();
      int sum = 0, j = 0;
      
      for(int index = 0; index < N; index++) {
      	int num = s.nextInt();
      	al.add(num);
      	sum += num;
      }
      
      for(j = N/2; j < al.get(j); j++) {
      	if(al.size() * al.get(j) > sum) {
      		sum = al.size() * al.get(j);
      		System.out.println(j+1);
      		break;
      	}
      }
  }
}


