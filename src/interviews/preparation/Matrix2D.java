package interviews.preparation;

import java.util.Arrays;
import java.util.List;

public class Matrix2D {
	
	public static void add(int[][] mat) {
		int sum = 0, cnt = 0;
for(int i = 0; i < mat.length; i++) {
	for(int j = 0; j < mat[0].length; j++) {
			sum += mat[i][j];
			cnt++;
			if(sum == 0) {
				break;
			}
	}
	if(sum == 0) {
		break;
	}
	
	
}
System.out.println(cnt);
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
			   						{1,-1,1},
			   						{2,-2,2},
			   						{3,-3,3},
		   						 };
		   						 
		   	add(mat);

	}

}
