/*
Given a string s which contains only lower alphabetic characters, 
check if it is possible to remove at most one character from this string 
in such a way that frequency of each distinct character becomes same in the string.
*/
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class EqualFrequencies{
   public static void main(String[] args){
      System.out.println(equalFrequencies("xyyz")); //True
      System.out.println(EqualFrequencies.equalFrequencies("xyyyz")); //False
   }
   
   /**
   * Checks if a given string's characters have the same frequency by removing 1 character.
   *
   * @param s
   * @return True if removing one character results in the string's characters having the same frequency, false otherwise
   */
   static boolean equalFrequencies(String s){
      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      for(int i = 0; i < s.length(); i++){
         hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
      }
      for(Character c : hm.keySet()){
         arr.add(hm.get(c));
      }
      for(int i = 0; i < arr.size(); i++){
         arr.set(i, arr.get(i)-1);
         if(equal(arr)){
            return true;
         }
         arr.set(i, arr.get(i)+1);
      }
      
      return false;
   }
   
   /**
   * Checks if every element in the given array is equal
   *
   * @param arr
   * @return True if every element is equal, false otherwise
   */
   static boolean equal(ArrayList<Integer> arr){
      for(int i = 0; i < arr.size()-1; i++){
         if(arr.get(i) != 0 && arr.get(i+1) != 0 && arr.get(i) != arr.get(i+1)){
            return false;
         }
      }
      return true;
   }
}