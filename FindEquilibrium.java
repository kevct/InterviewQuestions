/*
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. 
Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
If there is no equilibrium position, return -1.
*/

class FindEquilibrium{
   public static void main(String[] args){
      int arr1[] = {1,3,5,2,2}; 
      int arr2[] = {1,8,10,2,2,2,1}; 
      System.out.println(findEquilibrium(arr1)); //2
      System.out.println(findEquilibrium(arr2)); //-1
   }
   
   /**
   * Finds the equilibrium position of the array
   *
   * @param arr An array of integers to be processed
   * @return An integer showing the position of which the sums of the left side and the right side of the position are equal or -1 if none are found
   */
   static int findEquilibrium(int arr[]){
      if(arr.length > 3){
         int leftSide = arr[0];
         int rightSide = 0;
         //Left side will equal the first array element
         //Right side be the sum of all but the first two elemenets
         for(int i = 2; i < arr.length; i++){
            rightSide += arr[i];
         }
         
         for(int i = 1; i < arr.length-1; i++){
            if(leftSide == rightSide){
               return i;
            }
            //If leftSide != rightSide then add the current position to the left side and subtract i++ to right side
            leftSide += arr[i];
            rightSide -= arr[i+1];
         }
      }
      
      return -1; 
   }
}