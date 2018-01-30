package interviews.preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Demo {
	
	public void add(int i, int num, String s) {
		if(num == 0) return;
		for(i = 1; i < 10; i++) {
			s = s + i;
			add(i + 1, num - 1, s);
			System.out.println(s);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Arrays.sort(s);
        
        int max = 0;
        for(int i = 0; i < s.length-2; i++) {
            max = Math.max(Integer.parseInt(s[i+2])-Integer.parseInt(s[i]), max);
        }
        
        System.out.println(max);
        
	}

}
