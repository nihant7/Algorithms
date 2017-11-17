package interviews.preparation;

import java.util.Arrays;
import java.util.List;

public class FinderInArray {
	
	int[] p = new int[10];
	public FinderInArray() {
		for(int i = 0; i < p.length; i++) {
			p[i] = -1;
		}
	}
	
	String string;
	
	public String getString() {
		return string;
	}


	private static int find(int[] arr, int i, int target) {
		if(i == arr.length)
			return -1;
		
		if(arr[i] == target) {
			return target;
		}
		return find(arr, arr[++i], target);
		
	}
	

	
	public static void count(int[] arr) {
		int[] count = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		List list = Arrays.asList(arr);
		
		for(int i = 0; i < count.length; i++) 
		System.out.println(count[i]);
	}
	

	public static void main(String[] args) {
		FinderInArray fia = new FinderInArray();
		int[] arr = new int[] {1,2,3,3,4,5,6,1,3,4,5,8,4,5,6,6};
		System.out.println(find(arr,0,9));
		count(arr);
	}
	
	

}
