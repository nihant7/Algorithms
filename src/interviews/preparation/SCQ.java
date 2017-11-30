package interviews.preparation;

import java.util.HashSet;
import java.util.Scanner;

public class SCQ {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Scanner in1 = new Scanner(System.in);
		int num = in1.nextInt();
		
		int n = s.length();
		char[] a = s.toCharArray();
		HashSet<String> set = new HashSet<String>();
		int[] arr = new int[n];
		for(int i  = 0; i < n; i++) {
			String str = swap(a,a.length);
			set.add(str);
		}
		
		
		
	}

	private static String swap(char[] arr, int len) {
		char tmp = arr[len-1];
		for(int i = len-1; i >0 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = tmp;
		String str = new String(arr);
		return str;
	}
	
	

}
