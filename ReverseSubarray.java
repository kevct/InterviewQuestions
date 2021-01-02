/*
Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
*/

class ReverseSubarray{
   public static void main(String[] args){
      int[] a = {1,2,3,4,5};
      int[] result = reverseSubarray(a, 3);
      for(int i : result){
         System.out.print(i + " ");
      }
   }
   
   /**
   * Reverses a subarray
   *
   * @param a The array
   * @param k The subarray to be reversed
   * @return The new array with the reversed subarray
   */
   static int[] reverseSubarray(int[] a, int k){
      int low = 0;
      int high = k-1;
      while(low < high){
         int tmp = a[low];
         a[low] = a[high];
         a[high] = tmp;
         low++;
         high--;
      }
      return a;
   }
}