/*
Given two strings a and b. The task is to find if the string 
'b' can be obtained by rotating another string 'a' by exactly 2 places.
*/

class RotateTwice{
   public static void main(String[] args){
      System.out.println(rotateTwice("amazon", "azonam")); //True
      System.out.println(rotateTwice("amazon", "amazon")); //True
      System.out.println(rotateTwice("amazon", "onamaz")); //True
      System.out.println(rotateTwice("amazon", "foobar")); //False
   }
   
   /**
   * Checks if string b can be obtained by rotating string a exactly two places
   * 
   * @param a The string to rotate
   * @param b The target string
   * @return True if string b can be made by rotating string a twice, or false otherwise
   */
   static boolean rotateTwice(String a, String b){
      String tmp = a.substring(2, a.length()) + a.substring(0,2);
      String tmp2 = a.substring(a.length()-2, a.length()) + a.substring(0,a.length()-2);
      if(a.equals(b) || tmp.equals(b) || tmp2.equals(b)){
         return true;
      }
      return false;
   }
}