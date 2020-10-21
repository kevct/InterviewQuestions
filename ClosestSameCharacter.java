/*
Suppose that you’re given a String S, and N number of queries. Each query
represents an index i (constraints: 0 <= i < length of S) of a character in S.
YOU NEED TO:
For each query: print the index of the closest same character to S[i]. If S[i]
matches multiple different characters in S, print the smallest i. If no other
characters match S[i], return -1.
*/

class ClosestSameCharacter{
   public static void main(String[] args){
      String s = "sacramento";
      int n[] = {2, 1, 5, 0};
      int result[] = closestChar(s, n); //-1 4 -1 -1
      for(int i : result){
         System.out.print(i + " ");
      }
   }
   
   /**
   * Finds the closest same character as s[i] in the string
   *
   * @param s A string to be processed
   * @param queries An array containing the indexes of the characters to be processed
   * @return An array containing the index of the closest same character (-1 if none is found)
   */
   static int[] closestChar(String s, int[] queries){
      int result[] = new int[queries.length];
      for(int i = 0; i < queries.length; i++){
         char c = s.charAt(queries[i]);
         //Replace the character at query with an arbitrary character that is not a lowercase letter
         String tmp = s.substring(0, queries[i]) + "A" + s.substring(queries[i]+1, s.length());
         result[i] = tmp.indexOf(c);
      }
      return result;
   }
}
