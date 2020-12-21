/*Given two strings A and B. Find the characters that are not common in the two strings. */
import java.util.HashMap;

class UncommonCharacters{
   public static void main(String[] args){
      System.out.println(uncommonCharacters("geeksforgeeks", "geeksquiz"));
   }
   
   /**
   * Gets the characters that are not common between two strings
   *
   * @param a
   * @param b
   * @return A String containing the uncommon characters
   */
   static String uncommonCharacters(String a, String b){
      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
      String result = "";
      for(int i = 0; i < a.length(); i++){
         hm.put(a.charAt(i), 1);
      }
      for(int i = 0; i < b.length(); i++){
         hm.put(b.charAt(i), hm.getOrDefault(b.charAt(i), 0) + 1);
      }
      for(Character c : hm.keySet()){
         if(hm.get(c) == 1){
            result += c;
         }
      }
      return result;
   }
}