/* Given two arrays: arr1[0..m-1] of size m and arr2[0..n-1] of size n. 
Task is to check whether arr2[] is a subset of arr1[] or not. Both the arrays can 
be both unsorted or sorted. It may be assumed that elements in both array are distinct.
*/
import java.util.HashMap;

class Subset{
   public static void main(String[] args){
      int[] arr1 = {11, 1, 13, 21, 3, 7};
      int[] arr2 = {11, 3, 7, 1};
      
      System.out.println(subset(arr1, arr2));
   }
   
   /**
   * Checks if a1 is a subset of a2
   *
   * @param a1
   * @param a2
   * @return true if a2 is a subset of a1, false otherwise
   */
   static boolean subset(int[] a1, int[] a2){
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      for(int i : a1){
         hm.put(i, 1);
      }
      for(int i : a2){
         if(hm.get(i) == null){
            return false;
         }
      }
      return true;
   }
}
