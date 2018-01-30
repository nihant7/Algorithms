package interviews.preparation;

public class LIS {
	
	public int LongIncSub(int[] A) {
		int max = 0;
		int[] dp = new int[A.length];
		dp[0] = 1;
		for(int i = 1; i < A.length; i++) {
			if(max < A[i]) {
				max = A[i];
				dp[i] = dp[i-1] + 1;
			}
			else {
				dp[i] = dp[i-1];
			}
		}
		return dp[A.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {10,22,9,33,21,50,41,60,80};
		LIS lis = new LIS();
		System.out.println(lis.LongIncSub(A));
	}

}
