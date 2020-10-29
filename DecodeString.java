/*
This problem was recently asked by Google:
Given a string with a certain rule: k[string] should be expanded to string k times. 
So for example, 3[abc] should be expanded to abcabcabc. Nested expansions can happen, 
so 2[a2[b]c] should be expanded to abbcabbc. Assume inputs have the correct format.
*/
import java.util.Stack;

class DecodeString{
   public static void main(String[] args){
      System.out.println(decodeString("2[a2[b]c]")); //abbcabbc
      System.out.println(decodeString("2[ab4[d]c]")); //abddddcabddddc
   }
   
   /**
   * Takes a k[string] and decodes the message
   *
   * @param s This is the string to be decoded
   * @return String The decoded message
   */
   static String decodeString(String s){
      Stack<Integer> intStack = new Stack<Integer>();
      Stack<String> stack = new Stack<String>();
      
      for(int i = 0; i < s.length(); i++){
         //If the character is a digit then put in the integer stack
         if(Character.isDigit(s.charAt(i))){ 
            intStack.push(Character.getNumericValue(s.charAt(i)));
         //If the character is a close bracket then keep appending characters until an open bracket is reached
         }else if(s.charAt(i) == ']'){
            int num = intStack.pop();
            String tmp = "";
            String tmpString = "";
            //Keep appending characters to tmp string until an open bracket is reached
            while(!((stack.peek()).equals("["))){
               tmp = stack.pop() + tmp;
            }
            stack.pop(); //Pop the open bracket out of the stack
            //Repeat the string for the specified number of times
            for(int j = 0; j < num; j++){
               tmpString += tmp;
            }
            stack.push(tmpString); //Push the tmp value into the stack
         //If the character is neither a digit or a close bracket then append to stack
         }else{
            stack.push("" + s.charAt(i));
         } 
      }
      
      return stack.peek();
   }
}