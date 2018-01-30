package interviews.preparation;

public class MaxArray {
	
	public int sum(int[] A) {
		int[] dp = new int[A.length];
		dp[0] = 0;
		int max = 0;
		for(int i = 1; i < A.length; i++) {
			dp[i] = Math.max(dp[i-1] + A[i], A[i]);
			max = Math.max(dp[i],max);
			}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxArray ma = new MaxArray();
		int[] A= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(ma.sum(A));
	}

}
