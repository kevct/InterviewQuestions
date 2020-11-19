/*
This problem was recently asked by Uber:
Imagine you are building a compiler. Before running any code, the compiler 
must check that the parentheses in the program are balanced. Every opening 
bracket must have a corresponding closing bracket. We can approximate this 
using strings.
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
- Open brackets are closed by the same type of brackets.
- Open brackets are closed in the correct order.
- Note that an empty string is also considered valid.
Example:
Input: "((()))"
Output: True

Input: "[()]{}"
Output: True

Input: "({[)]"
Output: False
*/

import java.util.ArrayList;

class ValidBrackets{
   public static void main(String[] args){
      System.out.println(validBrackets("([{}])()")); //true
      System.out.println(validBrackets("()(){(())")); //false
      System.out.println(validBrackets("")); //true
   }
   
   /**
   * Checks if each opening bracket has a corresponding closing bracket and is in correct order
   *
   * @param s The string to be checked
   * @return True if the string has valid brackets, false otherwise
   */
   static boolean validBrackets(String s){
      ArrayList<Character> arr = new ArrayList<Character>();
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
            arr.add(s.charAt(i));
         }else if(s.charAt(i) == '}'){
            if(arr.get(arr.size()-1) != '{'){
               return false;
            }
            arr.remove(arr.size()-1);
         }else if(s.charAt(i) == ']'){
            if(arr.get(arr.size()-1) != '['){
               return false;
            }
            arr.remove(arr.size()-1);
         }else if(s.charAt(i) == ')'){
            if(arr.get(arr.size()-1) != '('){
               return false;
            }
            arr.remove(arr.size()-1);
         }
      }
      return arr.isEmpty();
   }
}