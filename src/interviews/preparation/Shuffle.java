package interviews.preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

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
		//arr = count(array);
		//Scanner
        Scanner s = new Scanner(System.in);
        int num = 10;                 // Reading input from STDIN
        int num1 = 12;
        long start = System.nanoTime();
        int add = num + num1;
        
        long end = System.nanoTime();
        long fin = end - start;
        System.out.println("Hi, " + add+ " in" + " " + fin);    // Writing output to STDOUT
	}
	
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
