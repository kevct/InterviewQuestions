/*
Given an integer an N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
*/

class FindFirstSetBit{
   public static void main(String[] args){
      System.out.println(findFirstSetBit(18)); //1
      System.out.println(findFirstSetBit(64)); //6
      System.out.println(findFirstSetBit(0)); //-1
   }
   
   /**
   * Finds the first set bit of a given number
   *
   * @param num
   * @return The position of the first set bit, or -1 if no bits are set
   */
   static int findFirstSetBit(int num){
      for(int i = 0; i < 32; i++){
         if(((num >> i) & 0x1) == 1){
            return i;
         }
      }
      return -1;
   }
}