/*
Given a String of length S, reverse the whole string without reversing the 
individual words in it. Words are separated by dots.
*/
class ReverseString{
   public static void main(String[] args){
      String s = "Hello.My.Name.Is.John.Doe";
      System.out.println(reverseString(s));
      //Doe.John.Is.Name.My.Hello
   }
   
   
   /**
   * Takes a string of words separated by '.' and reverses the string word by word
   *
   * @param s The string to be processed
   * @return The reversed string
   */
   static String reverseString(String s){
      if(s.length() > 1){
         String result = "";
         String arr[] = s.split("\\.");
         for(String i : arr){
            result = i + "." + result;
         }
         return result.substring(0, result.length()-1); //Gets rid of the last '.'
      }
      return "";
   }
}