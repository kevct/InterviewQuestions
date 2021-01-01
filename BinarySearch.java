/*
Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.
*/

class BinarySearch{
   public static void main(String[] args){
      int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
      System.out.println(binarySearch(arr, 13)); //12
   }
   
   /**
   * Finds the index of a given element in an array
   *
   * @param arr
   * @param k
   * @return The index of k in the array, or -1 if it is not in the array
   */
   static int binarySearch(int[] arr, int k){
      int max = arr.length-1;
      int min = 0;
      int mid = (max-min)/2;
      while(max >= min){
         if(arr[mid] == k){
            return mid;
         }else if(arr[mid] > k){
            max = mid - 1;
         }else{
            min = mid + 1;
         }
         mid = (max+min)/2;
      }
      return -1;
   }
}