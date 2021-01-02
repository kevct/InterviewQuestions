/*
This problem was recently asked by Apple:
Given a sorted list of size n, with m unique elements (thus m < n), 
modify the list such that the first m unique elements in the list will 
be sorted, ignoring the rest of the list. Your solution should have a 
space complexity of O(1).
Here's an example and some starter code.
*/
import java.util.ArrayList;
import java.util.Arrays;

class RemoveDuplicates{
   public static void main(String[] args){
      ArrayList arr = new ArrayList<Integer>();
      arr.add(1);
      arr.add(1);
      arr.add(1);
      arr.add(2);
      arr.add(3);
      arr.add(3);
      arr.add(4);
      arr.add(5);
      arr.add(5);
      arr.add(6);
      arr.add(7);
      arr.add(9);
      arr.add(9);
      arr.add(9);
      
      arr = removeDuplicates(arr);
      
      for(int i = 0; i < arr.size(); i++){
         System.out.print(arr.get(i) + " ");
      }
      //1 2 3 4 5 6 7 9
   }
   
   /**
   * Removes duplicate entires in an ArrayList
   *
   * @param arr The array to remove duplicates from
   * @return An ArrayList containing the removed duplicates
   */
   static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
      int i = 0;
      while(i < arr.size()-1){
         if(arr.get(i) == arr.get(i+1)){
            arr.remove(i+1);
         }else{
            i++;
         }
      }
      return arr;
   }
}