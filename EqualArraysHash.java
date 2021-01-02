/*
Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) 
of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
*/

import java.util.HashMap;

class EqualArraysHash{
   public static void main(String[] args){
      int arr1[] = {0, 1, 2, 3, 4};
      int arr2[] = {4, 3, 2, 1, 0};
      System.out.println(isEqual(arr1, arr2)); //true
   }
   
   /**
   * Checks if two arrays are equal
   *
   * @param arr1
   * @param arr2
   * @return true if arrays are equal, false otherwise
   */
   static boolean isEqual(int arr1[], int arr2[]){
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      if(arr1.length != arr2.length){
         return false;
      }
      for(Integer i : arr1){
         hm.put(i, hm.getOrDefault(i, 0) + 1);
      }
      
      for(Integer i : arr2){
         if(hm.get(i) == null || hm.get(i) == 0){
            return false;
         }
         hm.put(i, hm.getOrDefault(i, 0) - 1);
      }
      return true;
   }
}