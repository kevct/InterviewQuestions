/*
Given two lists V1 and V2 of sizes n and m respectively. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.
*/

import java.util.HashMap;
import java.util.ArrayList;

class CommonElements{
   public static void main(String[] args){
      int[] n = {3, 4, 2, 2, 4};
      int[] m = {3, 2, 2, 7};
      
      ArrayList<Integer> result = commonElements(n, m);
      for(Integer i : result){
         System.out.print(i + " ");
      }
   }
   
   /**
   * Finds common elements between two arrays
   *
   * @param n
   * @param m
   * @return An array containing the common elements
   */
   static ArrayList<Integer> commonElements(int[] n, int[] m){
      ArrayList<Integer> result = new ArrayList<Integer>();
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      
      for(int i : n){
         hm.put(i, hm.getOrDefault(i, 0) + 1);
      }
      for(int i : m){
         if(hm.get(i) != null && hm.get(i) > 0){
            result.add(i);
            hm.put(i, hm.getOrDefault(i, 0) - 1);
         }
      }
      
      return result;
   }
}