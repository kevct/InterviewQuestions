/*
The problem is to count all the possible paths from top left to bottom right of a MxN matrix with 
the constraints that from each cell you can either move to right or down.
*/

class CountPaths{
   public static void main(String[] args){
      System.out.print(countPaths(3,3)); //6
   }
   
   /**
   * Finds the number of possible paths from top left to bottom right of a m*n matrix
   *
   * @param m
   * @param n
   * @return The number of paths
   */
   static int countPaths(int m, int n){ 
      if(m == 1 || n == 1){
         return 1;
      }
      return countPaths(m-1, n) + countPaths(m, n-1);
   }
}