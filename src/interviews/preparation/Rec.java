package interviews.preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Rec {
	
	public void subsets(List<String> list) {
	    subsets(list, 0, list.size());
	}

	public void subsets(List<String> list, int start, int rem) {
	    if(rem == 0) {
	        System.out.println(list);
	        return;
	    }
	    
	    subsets(list, start + 1, rem - 1);
	    String str = list.remove(start);
	    subsets(list, start, rem - 1);
	    list.add(start, str);
	}
	
	public void add(int[] arr, int i, ArrayList<Integer> al) {
		if(i == arr.length) {
		return;
		}
		 
		 add(arr, i+1, al);
		 al.add(arr[i]);
	}
	
	public static void main(String[] args) {
		Rec rec = new Rec();
		int[] ar = {1,2,3,4};
		ArrayList<Integer> al = new ArrayList<Integer>();
//		List<String> al = new ArrayList<String>();
//		al.add("a");
//		al.add("b");
//		rec.subsets(al);
		rec.add(ar, 0, al);
		System.out.println(al);
	}

}
