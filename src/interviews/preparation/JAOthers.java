package interviews.preparation;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class JAOthers {

	static int[] add(int[][] arr) {
		int[][] T = new int[arr.length][arr[0].length];
		for(int i = 0; i < arr[0].length; ++i) {
			T[0][i] = arr[0][i];
		}
		int[] list = new int[arr[0].length];
		for(int j = 0; j < arr[0].length; j++) {
			list[j] = T[0][j] + arr[1][j];
		}
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for( int i= 0; i < list.length; i++ ) {
		    map.put( list[i], i );
		}
		
		Arrays.fill(list, 0);
		int index = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			list[index++] = entry.getValue()+1;
		}
		
		
		return list;
	}
	
	public static void main(String[] args) {
		
		

		int[][] arr = { {8,4,5,3,4},
						{1,2,6,1,3}
					  };
		
		int[] S = add(arr);
		
		for(int i = 0; i < S.length; i++) {
			System.out.println(S[i]);
		}
		
		}
	}


