package interviews.preparation;

import java.util.Scanner;

public class BestInternetBrowser {
	
	public static int actualString(String str) {
		int i = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '.') {
				break;
			}
		}
		return i+1;
	}
	
	public static int[] findVowels(String str, int i, int[] ar) {
		int count = 0, j = 0;
		for(j = i; j < str.length(); j++) {
			if(str.charAt(j) == '.') {
				break;
			}
			else if(str.charAt(j) != 'a' && str.charAt(j) != 'e'
					&& str.charAt(j) != 'i' && str.charAt(j) != 'o'
					&& str.charAt(j) != 'u' && str.charAt(j) != 'A' && str.charAt(j) != 'E'
					&& str.charAt(j) != 'I' && str.charAt(j) != 'O'
					&& str.charAt(j) != 'U') {
				count++;
			}
		}
		ar[0] = count;
		ar[1] = j;
		return ar;
	}

	public static void main(String[] args) {
	    
	    try {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int t = sc1.nextInt();
		
		String[] sa = new String[t];
			for(int i = 0; i < sa.length; i++) {
				sa[i] = sc.nextLine();
			}
		
		for(String s : sa) {	
		int[] ar = new int[2];
		int[] realArray = findVowels(s, actualString(s), ar);
		int first = realArray[0];
		int total = first + 4;
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append(total + "/" + s.length()).toString());
		}
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
		
	}

}
