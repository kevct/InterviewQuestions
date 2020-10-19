/* This problem was recently asked by Facebook:
Given two binary numbers represented as strings, return the sum of the two binary numbers as a new binary represented as a string. Do this without converting the whole binary string into an integer.
*/

class SumBinary{
   static String sumBinary(String s1, String s2){
      String result = "";
      int i = s1.length()-1, j = s2.length()-1, sum = 0;
      while(i >= 0 || j >= 0 || sum == 1){
         if(i >= 0){
            sum += s1.charAt(i) - '0';
         }else{
            sum += 0;
         }
         if(j >= 0){
            sum += s2.charAt(j) - '0';
         }else{
            sum += 0;
         }
         
         result = (char)(sum%2 + '0')+ result;
         sum /= 2;
         i--;
         j--;
      }
      return result;
   }

   public static void main(String[] args){  
      System.out.println(sumBinary("11101", "1011"));
      //101000
   }
}