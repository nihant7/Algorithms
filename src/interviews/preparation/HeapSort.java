package interviews.preparation;

public class HeapSort {
	
	public void heapify(int[] arr, int N, int i) {
		int largest = i;
		int l = 2*i + 1;
		int r = l + 1;
		
		if(l < N && arr[l] > arr[largest]) {
			largest = l;
		}
		
		if(r < N && arr[r] > arr[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			swap(arr, i, largest);
			heapify(arr, N,largest);
		}
	}
	
	
	
	private void swap(int[] arr, int i, int largest) {
		int tmp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = tmp;
	}

	public void sort(int[] arr) {
		for(int i = arr.length/2 - 1; i >= 0; i--)
		heapify(arr, arr.length, i);
		for(int i = arr.length - 1; i >= 0; i--) {
			swap(arr, i, 0); // Move root or highest to the bottom
			heapify(arr, i, 0);
		}
	}
	
	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		int[] arr = {13,11,12,15,18,20,5,6,7};
		hs.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}


}
