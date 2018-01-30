package interviews.preparation;

import java.util.Arrays;

public class MinMax {

	static int angryChildren(int k, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int res = max - min;
        return res;
    }
	
	
	public static void main(String[] args) {
		int k = 4;
		int[] arr = {1,2,3,4,100,200,10,30,40,10,20};
		System.out.println(angryChildren(k, arr));
	}

}
