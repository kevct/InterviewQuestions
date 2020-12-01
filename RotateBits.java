/*
Given an integer N and an integer D, you are required to write a program to rotate the 
binary representation of the integer N by D digits to the left as well as right and print 
the results in decimal values after each of the rotation.
*/

class RotateBits{
   public static void main(String[] args){
      rotateBits(229, 3); //1832
   }
   
   
   /**
   * Rotates The number n by d bits and prints the output.
   *
   * @param n The number to rotate
   * @param d The number of bits to rotate by
   * @return nothing
   */
   static void rotateBits(int n, int d){
      int tmp = n >> 32-d;
      n <<= d;
      System.out.println(n|tmp);
   }
}