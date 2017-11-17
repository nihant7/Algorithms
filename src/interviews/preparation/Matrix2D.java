package interviews.preparation;

import java.util.Arrays;
import java.util.List;

public class Matrix2D {
	
	public int find(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		int start = 0;
		int end = m*n-1;
		
		while(start <= end) {
			
		}
		
	}
	
	public static int number(int[][] mat, int row , int col) {
		if(row == 0 || col == mat.length-1) 
			return mat[row][col];
		else {
		number(mat, row+1,col);
		number(mat, row, col+1);
		}
		return mat[row][col];
	}


	public static void main(String[] args) {
		// create an array of strings
		   String a[] = new String[]{"abc","klm","xyz","pqr"};
		   
		   int[][] mat = new int[][] {
			   						{1,2,3},
			   						{4,5,6},
			   						{7,8,9},
		   						 };
		   						 
		   	System.out.println("The" + Matrix2D.number(mat, 0, 2));
		   
		   List list1 = Arrays.asList(a);

		   // printing the list
		   System.out.println("The list is:" + list1);

	}

}
