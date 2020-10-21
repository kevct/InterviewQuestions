/*This problem was recently asked by Google:
A criminal is constructing a ransom note. In order to disguise his handwriting, he is cutting out letters from a magazine.
Given a magazine of letters and the note he wants to write, determine whether he can construct the word.*/

class CanSpell{
   /** Checks if a word can be spelled with a given list of characters
   * @param c A list of characters
   * @param s A string that we want to spell
   *
   * @return True if s can be spelled with the characters in c or false otherwise
   */
   static boolean canSpell(char[] c, String s){
      for(char i : c){
         if(s.indexOf(i) != -1){
            if(s.indexOf(i) == s.length()-1){
               s = s.substring(0, s.length()-1);
            }else{
               s = s.substring(0, s.indexOf(i)) + s.substring(s.indexOf(i)+1, s.length());
            }
         }
      }
      if(!s.equals("")){
         return false;
      }
      return true;
   }
   
   public static void main(String[] args){
      char[] c = {'a', 'b', 'c', 'd', 'e', 'f'};
      System.out.println(canSpell(c, "bed")); //true
      System.out.println(canSpell(c, "cat")); //false
   }
}