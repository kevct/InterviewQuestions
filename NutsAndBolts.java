/*
Given a set of N nuts of different sizes and N bolts of different sizes. 
There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently.

Comparison of a nut to another nut or a bolt to another bolt is not allowed. 
It means nut can only be compared with bolt and bolt can only be compared with 
nut to see which one is bigger/smaller.
*/

import java.util.Arrays;

class NutsAndBolts{
   public static void main(String[] args){
      char[] nuts = {'@', '%', '$', '#', '^'};
      char[] bolts = {'%', '@', '#', '$', '^'};
      
      nutsAndBolts(nuts, bolts);
   }
   
   /**
   * Matches nuts and bolts
   *
   * @param nuts
   * @param bolts
   * @return nothing
   */
   static void nutsAndBolts(char[] nuts, char[] bolts){
      Arrays.sort(nuts);
      Arrays.sort(bolts);
      
      for(char i : nuts){
         System.out.print(i + " ");
      }
      System.out.println();
      for(char i : bolts){
         System.out.print(i + " ");
      }
   }
}