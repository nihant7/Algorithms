package interviews.preparation;

public class B extends A {
	
	void printMe() {
		
	}
	
	public static boolean isBalanced(String expression) {
		boolean flag = false;
        int s = 0;
        int e = expression.length() - 1;
        char[] arr = expression.toCharArray();
        while(s < e) {
        if((arr[s] == '{' && arr[e] == '}') || (arr[s] == '[' && arr[e] == ']') || (arr[s] == '(' && arr[e] == ')')) {
            flag = true;
          }
        else {
        	flag = false;
        }
        s++;
        e--;
        }
        return flag;
    }
	
	public static void main(String[] args) {
		System.out.println(B.isBalanced("{[()]}"));
		
		int[] arr = {0,1};
		arr[1] = arr[arr[0]];
		System.out.println(arr[1]);
	}

}
