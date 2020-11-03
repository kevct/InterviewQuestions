/*
This problem was recently asked by LinkedIn:
Given a string, convert it to an integer without using the builtin str function. 
You are allowed to use ord to convert a character to ASCII code.
Consider all possible cases of an integer. In the case where the string is not 
a valid integer, return None.
*/
import java.lang.Math;

class StringToInt{
   public static void main(String[] args){
      System.out.println(stringToInt("123456")); //123456
      System.out.println(stringToInt("12a3456"));//null
   }
   
   
   /**
   * Converts a given string to an integer
   *
   * @param s The string to be converted
   * @return An integer representing the string, or null if an invalid string
   */
   static Integer stringToInt(String s){
      int result = 0;
      for(int i = 0; i < s.length(); i++){
         //If the character is not a digit
         if(!Character.isDigit(s.charAt(i))){
            return null;
         }
         //Otherwise convert the digit to a number and add it to result
         result += (s.charAt(i) - '0') * Math.pow(10, s.length()-1-i);
      }
      return result;
   }
}