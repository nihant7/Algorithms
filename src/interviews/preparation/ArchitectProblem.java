package interviews.preparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArchitectProblem {
	
	

	public static void main(String[] args) {
		//Scanner
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int w = in.nextInt();
        Integer[] arr = new Integer[n];
        
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
 
        in.close();
        
        Arrays.sort(arr, Collections.reverseOrder());
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            int j=i+1;
            int temp = w;
            int count = 1;
            while(temp>0 && j<n){
                int diff = arr[i]-arr[j];
                temp -= diff;
                if(temp>=0){
                    count++;
                    j++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
        // Write your code 
	}

}
