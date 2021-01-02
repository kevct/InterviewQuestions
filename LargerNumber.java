/*
This problem was recently asked by Google:
Given a list of numbers, for each element find the next element that is larger 
than the current element. Return the answer as a list of indices. If there are 
no elements larger than the current element, then use -1 instead.
*/

class LargerNumber{
   public static void main(String[] args){
      int[] num = {3, 2, 5, 6, 9, 8};
      int[] result = largerNumber(num);
      for(int i : result){
         System.out.print(i + " ");
      }
      //2 2 3 4 -1 -1
   }
   
   /**
   * Returns the index of the next element that is larger than the current element
   *
   * @param A list of integers to process
   * @return The list of indicies
   */
   static int[] largerNumber(int[] num){
      int result[] = new int[num.length];
      for(int i = 0; i < num.length; i++){
         for(int j = i; j < num.length; j++){
            if(num[i] < num[j]){
               result[i] = j;
               break;
            }else if(j == num.length-1){
               result[i] = -1;
            }
         }
      }
      return result;
   }
}