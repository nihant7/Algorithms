package interviews.preparation;

import java.util.Scanner;

//A recursive solution for subset sum problem
class code
{
	// Returns true if there is a subset of set[] with sun equal to given sum
    static boolean isSubsetSum(int set[], int n, int sum)
    {
        // The value of subset[i][j] will be true if there 
            // is a subset of set[0..j-1] with sum equal to i
        boolean subset[][] = new boolean[sum+1][n+1];
      
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
          subset[0][i] = true;
      
        // If sum is not 0 and set is empty, then answer is false
        for (int i = 1; i <= sum; i++)
          subset[i][0] = false;
      
         // Fill the subset table in botton up manner
         for (int i = 1; i <= sum; i++)
         {
           for (int j = 1; j <= n; j++)
           {
             subset[i][j] = subset[i][j-1];
             if (i >= set[j-1])
               subset[i][j] = subset[i][j] || 
                                          subset[i - set[j-1]][j-1];
           }
         }
      
        /* // uncomment this code to print table
         for (int i = 0; i <= sum; i++)
         {
           for (int j = 0; j <= n; j++)
              System.out.println (subset[i][j]);
         } */
      
         return subset[sum][n];
         }
	/* Driver program to test above function */
	public static void main (String args[])
	{
Scanner n1 = new Scanner(System.in);
int num = n1.nextInt();
        
for(int i = 1; i <= num; i++) {
    if(i%3 == 0) {
        System.out.print("Fizz");
    }
    else if(i%5 == 0) {
        System.out.print("Buzz");
    }
    else {
    	System.out.print(i);
    }


} 
	}
}/* This code is contributed by Rajat Mishra */
