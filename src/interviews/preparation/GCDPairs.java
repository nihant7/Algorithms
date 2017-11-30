package interviews.preparation;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class GCDPairs {
	
	public static void pairs(long n) {
		ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();
		for(long i = 1; i <= n; i++) {
			ArrayList<Long> al = new ArrayList<Long>();
			if(n % i == 0 && gcd(i, n/ i)) {
				al.add(i);
				al.add(n/i);
				res.add(al);
			}
		}
		System.out.println(res.size());
	}

	private static boolean gcd(long i, long j) {
		long n = Math.min(i,  j);
		for(long x = 2; x <= n; x++) {
			if(i % x == 0 && j % x == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		pairs(260);
		long end = System.currentTimeMillis();

		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

	}

}
