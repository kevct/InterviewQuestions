/*This problem was recently asked by Uber:
Given a square 2D matrix (n x n), rotate the matrix by 90 degrees clockwise.
Here's an example and some starting code:*/

class RotateMatrix{
   /**
   * Rotates a given nxn matrix
   * 
   * @param matrix An nxn matrix
   * @return An nxn rotated matrix
   */
   static int[][] rotateMatrix(int[][] matrix){
      return matrix;
   }
   
   
   public static void main(String[] args){
      int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      /* 1 2 3 4 
      5 6 7 8 
      9 10 11 12 
      13 14 15 16 
   */
      
      int[][] result = rotateMatrix(matrix);
      
      for(int i = 0; i < result.length; i++){
         for(int j = 0; j < result[i].length; j++){
            System.out.print(result[i][j] + " ");
         }
         System.out.println();
      } 
   }
   
   
}