package interviews.preparation;

public class MinCost {

	public int minCost(int[][]mat, int m, int n) {
		int[][] dp = new int[m][n];
		dp[0][0] = mat[0][0];
		
		for (int i = 1; i < mat.length; i++) {
			dp[0][i] = mat[0][i] + dp[0][i - 1];
		}

		// fill the first column
		for (int i = 1; i < mat.length; i++) {
			dp[i][0] = mat[i][0] + dp[i - 1][0];
		}
		
		for(int i = 1; i < m ; i++) {
			for(int j = 1; j < n ; j++) {
				dp[i][j] = mat[i][j] + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]);
			}
		}
		return dp[m-1][n-1];
	}

	private int min(int i, int j, int k) {
		if(i < j) return (i < k) ? i : k;
		else return (j < k) ? j : k;
	}
	
	public static void main(String[] args) {
		MinCost mc = new MinCost();
		int[][] mat = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
				{ 2, 9, 8, 2 } };
		System.out.println(mc.minCost(mat, mat.length, mat.length));
		}
	}
	

