package interviews.preparation;

public class FindNumber {
	
	public int find(int[] arr, int i, int num) {
		if(i == arr.length && arr[i-1] != num) return -1;
		else if(arr[i] == -1) return -1;
		else if(arr[i] == num) return num;
		else return find(arr, i+1, num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,7,4,3};
		FindNumber fn = new FindNumber();
		System.out.println(fn.find(arr, 0, 3));
	}

}
