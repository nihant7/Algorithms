package interviews.preparation;

import java.util.ArrayList;
import java.util.HashSet;

public class SS {
	
	
	
	
	public static int special(int[] a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < a.length; i++) {
			for(int j = i; j < a.length; j++) {
				ArrayList<Integer> al = new ArrayList<Integer>();
				if(i == j) {
				al.add(a[i]);
				}
				else if(a[i] == a[j]) {
					al.add(a[i]);
					al.add(a[j]);
				}
				if(al.size() > 0) {
				res.add(al);
				}
			}
		}
		System.out.println(res);
		return res.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,1,2,2,3};
		System.out.println(special(a));
	}

}
