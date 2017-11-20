package interviews.preparation;

import java.util.Scanner;

public class ArraySorts {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int c = 0;
		int N = in.nextInt();
		
		int[] a = new int[N];
		
		for(int k = 0; k < N; k++) {
			a[k] = in.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(a[i]);
		}
		
		for(int i = 1; i < N; i++) {
			while(a[i] <= a[i-1]) {
				a[i] += 1;
				c++;
			}
		}
		
		System.out.println(c);
		
		for(int i = 0; i < N; i++) {
			System.out.println(a[i]);
		}
	}

}
