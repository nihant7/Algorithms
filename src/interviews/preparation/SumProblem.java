package interviews.preparation;

import java.util.Scanner;

public class SumProblem {

	public static void main(String[] args) {
		Scanner A  = new Scanner(System.in);
        Scanner B  = new Scanner(System.in);
        Scanner N  = new Scanner(System.in);
        Scanner in  = new Scanner(System.in);
        
        int a = A.nextInt();
        int b = B.nextInt();
        int n = N.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int sum = 0;
        for(int j = 0 ; j < n ; j++) {
            sum += arr[j];
            
        }
        
        if(sum <= b) {
            System.out.println("Sayan wins");
        }
        
        else if(sum <= a) {
            System.out.println("Raghu wins");
        }
        
        else if(a == b) {
            System.out.println("Tie");
        }
	}

}
