package interviews.preparation;

import java.util.Scanner;

public class BitDemo {
	
	// Count number of 1s
	public int count(int n) {
		int c = 0;
		while(n != 0) {
			n = n >> 1;
			c++;
		}
		return c;
	}
	
	// Check if a bit is set or not
	public boolean check(int i, int N) {
		if ((N & (1 << i)) != 0) {
			return true;
		}
		else {
				return false;
			}
		}
	
	public int number(int N) {
		while(N != 0) {
			N = N << 1;
		}
		return N;
	}
	
	
	public static void main(String[] args) {
		BitDemo bd = new BitDemo();
		
		
		
		Scanner s = new Scanner(System.in);
        int A = s.nextInt();                 // Reading input from STDIN
        int B = s.nextInt();
        int C = s.nextInt();
        int M = s.nextInt();
        
        int num = (int) ((Math.pow(A,B))/C);
        int prod = num % M;
        System.out.println(prod);
	}

}
