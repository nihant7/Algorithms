package interviews.preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	private static void shuffleArray(int[] array, int N) {
		Random rand = new Random();

		for(int i = N - 1; i > 0; i--) {
			int j = rand.nextInt(i);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		display(array, N);
	}
	
	
	private static void display(int[] array, int N) {
			System.out.println(Arrays.toString(array));
	}
	
	public static int[] count(int[] A) {
	int[] cnt = new int[] {0,0,0,0,0};
	for(int i = 0; i < A.length; ++i) {
		++cnt[A[i]-1];
	}
	for(int j : cnt)
		System.out.print(j + ",");
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		int[] array = new int[] {1,2,3,4,5,6,7};
//		display(array, array.length);
//		Shuffle.shuffleArray(array, array.length);		
//		Integer[] A = new Integer[] {e,g,d,g,e};
//		Shuffle.count(A);
		int[] arr = new int[100];
		arr = count(array);
		//Scanner
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();                 // Reading input from STDIN
        int num1 = s.nextInt();
        System.out.println("Hi, " + num + "." + num1);    // Writing output to STDOUT
	}

}
