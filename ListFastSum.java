/*
This problem was recently asked by Apple:
Create a class that initializes with a list of numbers and has one method 
called sum. sum should take in two parameters, start_idx and end_idx and 
return the sum of the list from start_idx (inclusive) to end_idx` (exclusive).
You should optimize for the sum method.
*/

class ListFastSum{
   int[] arr;
   public ListFastSum(int[] arr){
      this.arr = arr;
   }
   
   public int sum(int start_idx, int end_idx){
      int result = 0;
      for(int i = start_idx; i < end_idx; i++){
         result += arr[i];
      }
      return result;
   }
}

class Main{
   public static void main(String[] args){
      int[] arr = {1, 2, 3, 4, 5, 6, 7};
      ListFastSum test = new ListFastSum(arr);
      
      System.out.print(test.sum(2, 5)); //12
   }
}