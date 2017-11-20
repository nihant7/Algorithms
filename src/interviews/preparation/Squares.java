package interviews.preparation;

public class Squares {
	
	  boolean isSafe(int maze[][], int x, int y)
	  
	    {
		  int N = maze.length;
	        // if (x,y outside maze) return false
	        return (x >= 0 && x < N && y >= 0 &&
	                y < N && maze[x][y] == 1);
	    }
	int[][] dp = new int[5][5];
	public int count(int[][] mat, int i, int j, int cnt) {
		
		
		if(isSafe(mat,i,j) == true) {
		cnt = 1 + count(mat, i+1,j, cnt) + count(mat, i, j+1, cnt);
		}
		return cnt;
	}

	public static void main(String[] args) {
		Squares s = new Squares();
		// TODO Auto-generated method stub
		int[][] mat = { {1,0,0,1},
						{1,1,1,0},
						{0,0,1,0},
						{0,0,1,0},
					  };
		System.out.println(s.count(mat,0,0,0));
	}

}
