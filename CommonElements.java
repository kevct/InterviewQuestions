/*
Given two lists V1 and V2 of sizes n and m respectively. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.
*/

import java.util.HashMap;

class CommonElements{
   public static void main(String[] args){
      int[] n = {3, 4, 2, 2, 4};
      int[] m = {3, 2, 2, 7};
      
      int[] result = commonElements(n, m);
      for(int i : result){
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
   static int[] commonElements(int[] n, int[] m){
      int index = 0;
      int[] result = new int[n.length];
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      
      for(int i : n){
         hm.put(i, 1);
      }
      for(int i : m){
         hm.put(i, hm.getOrDefault(i, 0) + 1);
      }
      for(Integer i : hm.keySet()){
         if(hm.get(i) > 1){
            result[index] = i;
            index++;
         }
      }
      
      return result;
   }
}