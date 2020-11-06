/*
Your task is to implement the function strstr. The function takes two strings 
as arguments (s,x) and  locates the occurrence of the string x in the string s. 
The function returns and integer denoting the first occurrence of the string x 
in s (0 based indexing).
*/

class StrStr{
   public static void main(String[] args){
      System.out.println(strStr("Hello, World!", "Wo")); //7
   }
   
   /**
   * Finds first occurence of a string x in string s
   *
   * @param s The string to be processed
   * @param x The substring to find in s
   * @return The index of the start of the substring x in s, or -1 if x is not in s
   */
   static int strStr(String s, String x){
      return s.indexOf(x);
   }
}