package interviews.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountNumbers {
	
	protected static boolean isNotDuplicates(String s) {
		if(s == null) return false;
		char[] ch = s.toCharArray();
        Arrays.sort(ch);
		for(int i = 1; i < ch.length; i++) {
		if(ch[i-1] == ch[i]) {
			return false;
		}
	  }
		return true;
	}
	
	protected int count(int n) {
		if(n < 0) return -1;
        long calcNum = (long)Math.pow(10,n);
        long store = 0;
        for(int i = 10; i <= calcNum; i++) {
			String s = String.valueOf(i);
			if(isNotDuplicates(s)) {
				int num = Integer.parseInt(s);
				store += 1;
			}
		}
		long count = store + 10;
		System.out.println(count);
		return (int)count;
	}

	public static void main(String[] args) {
		CountNumbers cn = new CountNumbers();
		int val = 7;
		long start = System.currentTimeMillis();
		cn.count(val);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
