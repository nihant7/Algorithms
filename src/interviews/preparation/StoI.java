package interviews.preparation;

public class StoI {
	
	public static int stoi(String s) {
		int newNum = 0;
		char[] ch = s.toCharArray();
		int N = ch.length-1;
		for(int i = 0; i < ch.length; i++) {
			int num = ch[i] - '0';
			newNum += (int) (num * Math.pow(10, N));
			N = N-1;
		}
		return newNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stoi("3453"));
	}

}
