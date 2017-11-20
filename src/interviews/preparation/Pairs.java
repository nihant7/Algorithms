package interviews.preparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Pairs {
	
	public Map<Object, Object> pairs(int[] arr, int target) {
		Map<Object, Object> map = new HashMap<Object, Object>();

		for(int i = 0; i < arr.length; i++) {
		int div = target / arr[i];
		if(!map.containsValue(div)) {
			map.put(div, arr[i]);
			}
		}
		return map;
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,12};
		Pairs pairs = new Pairs(); 
		System.out.println(pairs.pairs(arr, 12));
		Map<Object, Object> map = pairs.pairs(arr, 12);
        ArrayList<ArrayList<Object>> all = convertToList(map);
		System.out.println(all);
	}


	private static ArrayList<ArrayList<Object>> convertToList(Map<Object, Object> map) {
		ArrayList<ArrayList<Object>> all = new ArrayList<ArrayList<Object>>();
		for (Map.Entry<Object, Object> entry : map.entrySet()) {
	        ArrayList<Object> al = new ArrayList<Object>();
            Object key = entry.getKey();
            Object value = entry.getValue();
            al.add(key);
            al.add(value);
            Collections.addAll(all, al);
}
		return all;
	}

}
