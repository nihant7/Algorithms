package interviews.preparation;

public class KMP {
	
	public void computeLPS(String pat, int M, int[] lps) {
		lps = new int[pat.length()];
		int l = 1, r = pat.length();
		int len = 0;
		while(l <= r) {
			if(pat.charAt(l) == pat.charAt(len)) {
				len++;
				lps[l] = len;
				l++;
			}
			else {
				if(len != 0) {
					len = lps[l];
				}
				else {
					lps[l] = len;
					l++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
