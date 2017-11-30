package interviews.preparation;

import java.util.Scanner;

public class IntelligentGirl {
	
	public static int helper(String s, int i) {
		int count = 0;
		for(int j = i ; j < s.length(); j++) {
			int num = s.charAt(j) - '0';
			if(num % 2 == 0) {
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "574674546476";
		for(int index = 0; index < s.length(); index++) {
		int num = helper(s,index);
		System.out.print(num + " ");
		}
	}

}
