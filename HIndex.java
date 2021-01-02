/*
This problem was recently asked by Amazon:
The h-index is a metric that attempts to measure the productivity and citation impact of the publication of a scholar. 
The definition of the h-index is if a scholar has at least h of their papers cited h times.
Given a list of publications of the number of citations a scholar has, find their h-index.
Example:
Input: [3, 5, 0, 1, 3]
Output: 3

Explanation:
There are 3 publications with 3 or more citations, hence the h-index is 3.
*/

import java.util.Arrays;

class HIndex{
   public static void main(String[] args){
      int[] pub = {0,1,2,6,8,2,4,5,5,5,4,3,4,5,76,10,2,4,4,9,9};
      int[] pub2 = {3,5,0,1,3};
      System.out.println(hIndex(pub)); //6
      System.out.println(hIndex(pub2)); //3
   }
   
   /**
   * Finds the h-index of an author
   *
   * @param pub A list of publications of the number of citations a scholar has
   * @return The author's h-index
   */
   static int hIndex(int[] pub){
      Arrays.sort(pub);
      for(int i = pub.length-1; i >= 0; i--){
         if(pub.length - i >= pub[i]){
            return pub[i];
         }
      }
      return 0;
   }
}