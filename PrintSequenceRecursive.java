/*
Print a sequence of numbers starting with N, without using loop, in which  
A[i+1] = A[i] - 5,  if  A[i]>0, else A[i+1]=A[i] + 5  repeat it until A[i]=N.

Example:
Input:
16
Output:
16 11 6 1 -4 1 6 11 16
*/

import java.util.List;
import java.util.ArrayList;

class PrintSequenceRecursive{
   public static void main(String[] args){
      List<Integer> arr = printSequenceRecursive(16);
      for(int i : arr){
         System.out.print(i + " ");
      }
      //16 11 6 1 -4 1 6 11 16
   }
   
   /**
   * Prints a sequence of numbers such that A[i+1] = A[i] - 5 if A>0 and A[i+1] = A[i] + 5 otherwise
   *
   * @param num The number to be processed
   * @return A sequence of numbers
   */
   static List<Integer> printSequenceRecursive(int num){
      ArrayList<Integer> result = new ArrayList<Integer>();
      result.add(num);
      if(num <= 0){
         return result;
      }
      result.addAll(printSequenceRecursive(num-5));
      result.add(num);
      return result;
   }
}