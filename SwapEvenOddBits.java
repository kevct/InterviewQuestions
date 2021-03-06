/*
Given an unsigned integer N. The task is to swap all odd bits with even bits. 
For example, if the given number is 23 (00010111), it should be converted to 
43(00101011). Here, every even position bit is swapped with adjacent bit on right 
side(even position bits are highlighted in binary representation of 23), and every odd 
position bit is swapped with adjacent on left side.
*/

class SwapEvenOddBits{
   public static void main(String[] args){
      System.out.print(swapEvenOddBits(23)); //43
   }
   
   /** Swaps even and odd bits of a number
   *
   * @param num The number to be processed
   * @return The number with swapped even and odd bits
   */
   static int swapEvenOddBits(int num){
      //int is 32 bits
      int even = num & 0xAAAAAAAA;
      int odd = num & 0x55555555;
      
      even >>= 1;
      odd <<= 1;
      return even | odd;
   }
}