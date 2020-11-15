/*
This problem was recently asked by Facebook:
Given an array and an integer k, rotate the array by k spaces. 
Do this without generating a new array and without using extra space.
*/
import java.util.ArrayList;

class RotateList{
   public static void main(String[] args){
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 1; i <= 5; i++){
         list.add(i);
      }
      list = rotateList(list, 3);
      //{3,4,5,1,2}
      
      for(int i : list){
         System.out.print(i + " ");
      }
   }
   
   /**
   * Rotates a given list by k spaces
   *
   * @param list The list to be rotated
   * @param k The number of spaces to rotate the list
   * @return The rotated list
   */
   static ArrayList<Integer> rotateList(ArrayList<Integer> list, int k){   
      for(int i = 0; i < k; i++){
         int tmp = list.get(list.size()-1);
         list.remove(list.size()-1);
         list.add(0,tmp);
      }
      
      return list;
   } 
}