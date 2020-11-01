/*
This problem was recently asked by Google:
Given a sorted list of numbers, and two integers low and high representing 
the lower and upper bound of a range, return a list of (inclusive) ranges 
where the numbers are missing. A range should be represented by a tuple in the 
format of (lower, upper).
*/

import java.util.ArrayList;

class MissingRanges{
   public static void main(String[] args){
      int arr[] = {1, 3, 5, 10};
      ArrayList<int[]> result = missingRanges(arr, 1, 10);
      
      for(int i = 0; i < result.size(); i++){
          System.out.print("(" + (result.get(i))[0] + ", " + (result.get(i))[1] + ") ");
      }
      //(2, 2) (4, 4) (6, 9)
   }
   
   /**
   * Prints the missing ranges for a given array and a given range
   *
   * @param arr The array to be processed
   * @param min The min of the range
   * @param max The max of the range
   * @return int[][] A 2D array showing the missing ranges  
   */
   static ArrayList<int[]> missingRanges(int[] arr, int min, int max){
      ArrayList<int[]> result = new ArrayList<int[]>();
      if(arr.length >= 1){
         int low = min;
         int high = arr[0];
         //If the array does not start at min
         if(low != high){ 
            int[] tmp = {low, high-1};
            result.add(tmp);
         }
         //Go through the array and find missing ranges
         for(int i = 1; i < arr.length; i++){
            low = arr[i-1];
            high = arr[i];
            if(high-low!=1){
               int[] tmp = {low+1, high-1};
               result.add(tmp);
            }
         }
         //If the array does not end at max
         if(high != max){
            int[] tmp = {high+1, max};
            result.add(tmp);
         }
         
      }else{ //If there are no elements in the array then the missing range is (min, max)
         int[] tmp = {min, max};
         result.add(tmp);
      }
      return result;
   } 
}