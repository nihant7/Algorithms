package interviews.preparation;

import java.util.Stack;

public class DeleteFriend {
	
	public Stack<Integer> deleteFriend(int friends, int delNum, int[] arr) {
		boolean delete = false;
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			int top = st.peek();
			if(top < arr[i]) {
				st.pop();
				st.push(arr[i]);
			}
			else{
				st.push(arr[i]);
			}
			
		}
		return st;
	}

	public static void main(String[] args) {
		int n = 5;
		int del = 2;
		int[] ar = {19,12,3,4,17};
		DeleteFriend df = new DeleteFriend();
		System.out.println(df.deleteFriend(n, del, ar));
	}

}
