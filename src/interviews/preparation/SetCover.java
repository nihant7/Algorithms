package interviews.preparation;

import java.util.Arrays;
import java.util.HashSet;

public class SetCover {
	
	public boolean isSafe(int[] U, int[] S1, int[] S2) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int a : S1) {
			set.add(a);
		}
		for(int a : S2) {
			set.add(a);
		}
		int len = Math.max(set.size(), U.length);
		for(int i = 0; i < len; i++) {
			if(!set.contains(U[i])) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int[] U = {1,2,3,4,5};
		int[] S1 = {4,1,3};
		int[] S2 = {2,5};
		SetCover sc = new SetCover();
		boolean flag = sc.isSafe(U, S1, S2);
		System.out.println(flag);
	}

}
