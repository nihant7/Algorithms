package interviews.preparation;

import java.util.Scanner;

public class Group {
	int count = 0;
	int l = 0, r = 0;

	public void groups(int []A) {
		int[] B = new int[A.length];
		
		for(int i = 0; i < B.length; ++i) {
			B[i]=0;
		}
		
		for(int i = 0; i < A.length; i++) {
			++B[A[i]];
		}
		for(int i = 0; i < B.length; i++) {
			System.out.print(B[A[i]] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] A = {1,6,5,7,5,6,3,8,2,3};
		Group g = new Group();
		g.groups(A);
		}
	}

