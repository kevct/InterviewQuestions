/*
This problem was recently asked by Amazon:
You are given a 2D array of integers. Print out the clockwise spiral traversal of the matrix.
Example:
grid = [[1,  2,  3,  4,  5],
        [6,  7,  8,  9,  10],
        [11, 12, 13, 14, 15],
        [16, 17, 18, 19, 20]]

The clockwise spiral traversal of this array is:
1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12
*/

class MatrixSpiralTraversal{
   public static void main(String[] args){
      /*int arr[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20}};*/
      int arr[][] = new int[10][10];
      System.out.println("{");
      for(int i = 0; i < 10; i++){
         System.out.print("{");
         for(int j = 0; j < 10; j++){
            arr[i][j] = (10*i) + j;
            System.out.printf("%2d, ", (10*i) + j);
         }
         System.out.println("}");
      }
      System.out.println("}");
      
      
      spiralTraverse(arr); //1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12
   }
   
   static void spiralTraverse(int arr[][]){
      int rowMin = 0, rowMax = arr.length-1, colMin = 0, colMax = arr[0].length-1;
      while(rowMin < rowMax && colMin < colMax){
         //Print first row
         for(int i = colMin; i <= colMax; i++){
            System.out.print(arr[rowMin][i] + " ");
         }
         rowMin++; //Increment rowMin by 1 since you've traversed the first row
         
         //Print last column
         for(int i = rowMin; i <= rowMax; i++){
            System.out.print(arr[i][colMax] + " ");
         }
         colMax--; //Decrement colMax by 1 since you've traversed the last column
         
         
         //Print last row starting from last element
         for(int i = colMax; i >= colMin; i--){
            System.out.print(arr[rowMax][i] + " ");
         }
         rowMax--; //Decrement rowMax by 1 since you've traversed the last row
         
         //Print first column starting from last element
         for(int i = rowMax; i >= rowMin; i--){
            System.out.print(arr[i][colMin] + " ");
         }
         colMin++; //Increment colMin by 1 since you've traversed the first column
      }
   }
   
}