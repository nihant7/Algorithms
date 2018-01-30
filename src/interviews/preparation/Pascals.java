package interviews.preparation;

import java.util.Arrays;

public class Pascals {

	
	private static int[][] PT(int N) {
		int[][] dp = new int[N][N];
		for(int i = 0; i < N; i++) {
			dp[i][0] = dp[0][i] = 1;
		}
		for(int i = 1; i < N; i++) {
			for(int j = 1; j < N; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp;
	}
	public static void main(String[] args) {
		int N  = 7;
		int[][] mat = PT(N);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.println(mat[i][j]);
			}
		}
	}

}
