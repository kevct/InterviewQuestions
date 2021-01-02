/* Given an array having both positive and negative integers. 
The task is to compute the length of the largest subarray with sum 0.*/
class ZeroSum{
   public static void main(String[] args){
      int[] arr = {15,-2,2,-8,1,7,10,23};
      System.out.print(zeroSum(arr)); //5
   }
   
   /**
   * Finds size of largest subarray that sums to zero
   * 
   * @param arr 
   * @return The size of the largest subarray or -1 if there is no subarray that sums to 0
   */
   static int zeroSum(int[] arr){
      for(int i = 0; i < arr.length; i++){
         for(int j = arr.length; j > i; j--){
            if(sum(arr, i, j) == 0){
               return j-i;
            }
         }
      }
      return -1;
   }
   
   /**
   * Returns sum of a given array
   *
   * @param arr
   * @param start_idx
   * @param end_idx
   * @return The sum of arr from start_idx to end_idx
   */
   static int sum(int[] arr, int start_idx, int end_idx){
      int result = 0;
      for(int i = start_idx; i < end_idx; i++){
         result += arr[i];
      }
      return result;
   }
}