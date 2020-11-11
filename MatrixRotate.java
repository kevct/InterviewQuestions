/*
This problem was recently asked by Uber:
Given a square 2D matrix (n x n), rotate the 
matrix by 90 degrees clockwise.
*/
import java.util.ArrayList;

class MatrixRotate{
   public static void main(String[] args){
      int[][] matrix = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        
      int[][] result = matrixRotate(matrix);
      for(int[] i : result){
         for(int j : i){
            System.out.printf("%2d ", j); 
         }
         System.out.println();
      }
   }
   
   
   /**
   * Rotates an nxn matrix 90 degrees clockwise
   *
   * @param matrix The matrix to be rotated
   * @return A rotated version of the matrix
   */
   static int[][] matrixRotate(int[][] matrix){
      int[][] result = new int[matrix.length][matrix[0].length];
      //For each column in matrix convert it to a row in result
      for(int i = 0; i < matrix.length; i++){
         ArrayList<Integer> tmp = new ArrayList<Integer>();
         for(int j = matrix.length-1; j >= 0; j--){
            tmp.add(matrix[j][i]);
         }
         result[i] = tmp.stream().mapToInt(k -> k).toArray();
      }
      
      return result;
   }
}