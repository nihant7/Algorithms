package interviews.preparation;


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
    
    public static Stack<Integer> deleteFriend(int friends, int delNum, int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			int top = st.peek();
			if(top < arr[i]) {
				st.pop();
				st.push(arr[i]);
			}
			else{
				st.push(arr[i]);
			}
			
		}
		return st;
	}
	
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
    	Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        
        
        Scanner sc2 = new Scanner(System.in);
        
        int[] ar = new int[N];
        for(int i = 0; i < N; i++) {
            ar[i] = sc2.nextInt();
        }
        
        Stack<Integer> retStack = deleteFriend(N, n, ar);
        
        Iterator itr = retStack.iterator();
        
        while(itr.hasNext()) {
        	System.out.print(itr.next() + " ");
        }
    }
}
