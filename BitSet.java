/*
Given a number N and a bit number K, check if Kth bit of N is set or not. 
*/

class BitSet{
   public static void main(String[] args){
      System.out.println(bitSet(4, 0)); //false
      System.out.println(bitSet(4, 2)); //true
   }
   
   /** Checks if bit in number n at position k is set
   *
   * @param n
   * @param k
   * @return True if bit is set, false otherwise
   */
   static boolean bitSet(int n, int k){
      int i = 0x1 << k;
      return n == (n | k);
   }
}