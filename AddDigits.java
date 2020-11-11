/*
This problem was recently asked by Amazon:
Given a number like 159, add the digits repeatedly until you get a single number.
For instance, 1 + 5 + 9 = 15.
1 + 5 = 6.
So the answer is 6.
*/

class AddDigits{
   public static void main(String[] args){
      System.out.println(addDigits(159)); //6
   }
   
   /**
   * Add digits of a given number until a single digit result is given
   *
   * @param num The number to be processed
   * @return An integer containing the result of adding the digits
   */
   static int addDigits(int num){
      int result = num;
      //While result is not single digit number
      while(result > 9){
         int tmp = 0;
         //Add digits of result to tmp
         while(result > 0){
            tmp += result % 10;
            result /= 10;
         }
         result = tmp;
      }
      return result;
   }
}