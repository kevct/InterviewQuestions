/*
This problem was recently asked by Amazon:
Given an array of size n, and all values in the array are in the range 1 to n, find all the duplicates.
*/
import java.util.ArrayList;
import java.util.Arrays;

class FindDuplicates{
   public static void main(String[] args){
      int[] arr = {4,3,2,7,8,2,3,1};
      ArrayList<Integer> result = findDuplicates(arr);
      
      for(int i = 0; i < result.size(); i++){
         System.out.print(result.get(i) + " ");
      }
      //2 3
   }
   
   /**
   * Finds duplicate elements in an array.
   * 
   * @param arr The array to be processed.
   * @return An ArrayList containing the duplicate elements.
   */
   static ArrayList<Integer> findDuplicates(int[] arr){
      ArrayList<Integer> result = new ArrayList<Integer>();
      Arrays.sort(arr);
      for(int i = 0; i < arr.length-1; i++){
         if(arr[i] == arr[i+1]){
            if(!result.contains(arr[i])){
               result.add(arr[i]);
               i += 1;
            }
         }
      }
      return result;
   }
}