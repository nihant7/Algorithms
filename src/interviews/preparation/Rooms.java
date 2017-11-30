package interviews.preparation;

import java.util.Scanner;

public class Rooms {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int gts = in.nextInt();
		
		int[] arrival = new int[gts];
		for(int i = 0; i < arrival.length; i++) {
			arrival[i] = in.nextInt();
		}

		int[] duration = new int[gts];
		for(int j = 0; j < arrival.length; j++) {
			duration[j] = in.nextInt();
		}
		
		int res[] = new int[gts];
		
		int max = 0;
		int cnt = 0;
		res[0] = arrival[0];
		for(int k = 0; k < gts; k++) {
			int i = 0;
			while(i < k) {
				if(arrival[k] == arrival[i] + duration[i]) {
					i = k;
					max = cnt;
				}
				else  {
					cnt++;
					i++;
				}
			}
			}
		}
	

}
