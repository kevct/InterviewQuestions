/* 
This problem was recently asked by Microsoft:
Given an array of heights, determine whether the array forms a "mountain" pattern. A mountain pattern goes up and then down.
Like
  /\
 /  \
/    \
*/

class ValidMountainArray{
   public static void main(String[] args){
      int arr1[] = {1, 2, 3, 2, 1};
      int arr2[] = {1, 2, 2, 1};
      int arr3[] = {1, 2, 3};
      System.out.println(validMountainArray(arr1)); //True
      System.out.println(validMountainArray(arr2)); //True
      System.out.println(validMountainArray(arr3)); //False
   }
   
   /**
   * Determines if a given array is a valid mountain array
   *
   * @param arr The array to be processed
   * @return A boolean showing if the array is a valid mountain array
   */
   static boolean validMountainArray(int[] arr){
      int low = 0;
      int high = arr.length-1;
      
      while(low < high){
         if(arr[low] != arr[high]){
            return false;
         }
         low++;
         high--;
      }
      return true;
   }
}