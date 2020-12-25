/*
Given a string S. The task is to find the first repeated character in it. 
We need to find the character that occurs more than once and whose index of 
second occurrence is smallest. S contains only lowercase letters.
*/

import java.util.HashMap;

class FirstRepeatedCharacter{
   public static void main(String[] args){
      System.out.print(firstRepeatedCharacter("abccba")); //a
   }
   
   /**
   * Finds the first repeated character in a string
   *
   * @param s
   * @return The first repeated character
   */
   static char firstRepeatedCharacter(String s){
      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
      for(int i = 0; i < s.length(); i++){
         hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
      }
      for(Character c : hm.keySet()){
         if(hm.get(c) > 1){
            return c;
         }
      }
      return ' ';
   }
}