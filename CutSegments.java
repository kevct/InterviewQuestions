/*
Given an integer N denoting the Length of a line segment. You need to cut the line segment in such a way that the cut length of a line segment each time is either x , y or z. Here x, y, and z are integers.
After performing all the cut operations, your total number of cut segments must be maximum.
*/

import java.lang.Math;
import java.util.Arrays;

class CutSegments{
   public static void main(String[] args){
      System.out.println(cutSegments(5, 5, 3, 2));
   }
   
   /**
   * Finds the maximum number of segments n can be divided into
   *
   * @param a
   * @param b
   * @param c
   * @param z
   * @return The max number of segments
   */
   static int cutSegments(int n, int a, int b, int c){
      //Solution from https://www.geeksforgeeks.org/maximum-number-segments-lengths-b-c/
        // stores the maximum number of 
        // segments each index can have 
        int dp[] = new int[n + 10]; 
  
        // initialize with -1 
        Arrays.fill(dp, -1); 
  
        // 0th index will have 0 segments 
        // base case 
        dp[0] = 0;  
  
        // traverse for all possible  
        // segments till n 
        for (int i = 0; i < n; i++)  
        { 
            if (dp[i] != -1)  
            { 
  
                // conditions 
                if(i + a <= n )    //avoid buffer overflow 
                dp[i + a] = Math.max(dp[i] + 1,  
                                    dp[i + a]); 
                                      
                if(i + b <= n )    //avoid buffer overflow 
                dp[i + b] = Math.max(dp[i] + 1,      
                                    dp[i + b]); 
                                      
                if(i + c <= n )    //avoid buffer overflow 
                dp[i + c] = Math.max(dp[i] + 1,  
                                    dp[i + c]); 
            } 
        } 
        return dp[n]; 
    } 
}