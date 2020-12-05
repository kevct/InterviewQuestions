//You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

class BitsToFlip{
   public static void main(String[] args){
      System.out.println(bitsToFlip(10, 20)); //4
   }

   /**
   * Finds the number of bits to flip to convert a into b
   *
   * @param a
   * @param b
   * @return The number of bits to flip
   */
   static int bitsToFlip(int a, int b){
      int result = 0;
      int toFlip = a^b;
      for(int i = 0; i < 32; i++){
         result += (toFlip & 1);
         toFlip >>= 1;
      }
      return result;
}
}