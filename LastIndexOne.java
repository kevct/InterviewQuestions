/* Given a string S consisting only '0's and '1's,  print the last index of the '1' present in it. */

class LastIndexOne{
   public static void main(String[] args){
      System.out.println(lastIndexOne("01010100")); //5
      System.out.println(lastIndexOne("00000000")); //-1
   }
   
   /**
   * Finds the last index of the '1' present in a string
   *
   * @param s The string to be processed
   * @param The index of the last '1', or -1 if there is no 1
   */
   static int lastIndexOne(String s){
      for(int i = s.length()-1; i >= 0; i--){
         if(s.charAt(i) == '1'){
            return i;
         }
      }
      return -1;
   }
}