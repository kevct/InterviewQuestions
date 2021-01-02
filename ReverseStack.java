/*
Write a program to reverse a stack using recursion. 
You are not allowed to use loop constructs like while, for..etc, 
and you can only use the following ADT functions on Stack S: 
isEmpty(S) 
push(S) 
pop(S)
*/

import java.util.Stack; 

class ReverseStack{
   static Stack<Integer> stack = new Stack<Integer>();
   
   public static void main(String[] args){
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      
      System.out.println(stack);
      reverse();
      System.out.println(stack);
   }
   
   
   // Solution from https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
   static void insert_at_bottom(int x) 
    { 
  
        if(stack.isEmpty()) 
            stack.push(x); 
  
        else
        { 
              
            // All items are held in Function 
            // Call Stack until we reach end 
            // of the stack. When the stack becomes 
            // empty, the st.size() becomes 0, the 
            // above if part is executed and  
            // the item is inserted at the bottom 
            int a = stack.peek(); 
            stack.pop(); 
            insert_at_bottom(x); 
  
            // push allthe items held  
            // in Function Call Stack 
            // once the item is inserted  
            // at the bottom 
            stack.push(a); 
        } 
    } 
      
    // Below is the function that  
    // reverses the given stack using 
    // insert_at_bottom() 
    static void reverse() 
    { 
        if(stack.size() > 0) 
        { 
              
            // Hold all items in Function 
            // Call Stack until we 
            // reach end of the stack  
            int x = stack.peek(); 
            stack.pop(); 
            reverse(); 
              
            // Insert all the items held  
            // in Function Call Stack 
            // one by one from the bottom 
            // to top. Every item is 
            // inserted at the bottom  
            insert_at_bottom(x); 
        } 
    } 
}