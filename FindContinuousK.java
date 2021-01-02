/*
This problem was recently asked by Amazon:
You are given an array of integers, and an integer K. Return the subarray 
which sums to K. You can assume that a solution will always exist.
*/

class FindContinuousK{
   public static void main(String[] args){
      int[] num = {1, 3, 2, 5, 7, 2};
      findContinuousK(num, 14); //{2,5,7}
   }
   
   /**
   * Finds a subarray that sums to k
   *
   * @param num The array of numbers to be summed
   * @param k The target number to sum to
   * @return nothing
   */
   static void findContinuousK(int[] num, int k){
      int start = 0;
      int end = 1;
      while(end < num.length){
         if(sumArray(num, start, end) < k){
            end++;
         }else if(sumArray(num, start, end) > k){
            start++;
         }else{
            break;
         }
      }
      
      System.out.print("{");
      for(int i = start; i < end; i++){
         if(i == end-1){
            System.out.println(num[i] + "}");
         }else{
            System.out.print(num[i] + ", ");
         }
      }
   }
   
   /**
   * Sums an array by the specified elements
   * 
   * @param num The array
   * @param start The start index
   * @param end The end index
   * @return the sum of the array
   */
   static int sumArray(int[] num, int start, int end){
      int result = 0;
      for(int i = start; i < end; i++){
         result += num[i];
      }
      return result;
   }
}