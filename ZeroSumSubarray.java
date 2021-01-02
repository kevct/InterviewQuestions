/*
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
*/
class ZeroSumSubarray{
   public static void main(String[] args){
      int[] arr = {15,-2,2,-8,1,7,10,23};
      System.out.println(zeroSumSubarray(arr));
   }

   /**
   * Finds length of largest subarray with sum 0
   *
   * @param arr 
   * @return The length of the largest subarray with length 0
   */
   static int zeroSumSubarray(int[] arr){
      int min = 0;
      int max = arr.length;
      while(min < max){
         for(int i = min; i < max; i++){
            if(sum(arr, i, max) == 0){
               return max-i;
            }
         }
         max--;
      }
      return 0;
   }
   
   /**
   * Finds sum of subarray
   *
   * @param arr
   * @param i Start index
   * @param k End index
   * @return The sum of the subarray from i (inclusive) to k (exclusive)
   */
   static int sum(int[] arr, int i, int k){
      int result = 0;
      for(int j=i; j < k; j++){
         result += arr[j];
      }
      return result;
   }
}