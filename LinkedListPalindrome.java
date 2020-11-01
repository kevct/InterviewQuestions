/*
This problem was recently asked by Microsoft:
You are given a doubly linked list. Determine if it is a palindrome.
Can you do this for a singly linked list?
*/

class LinkedListPalindrome{
   public static void main(String[] args){
      DLL head = new DLL('a');
      head.next = new DLL('b');
      head.next.prev = head;
      head.next.next = new DLL('c');
      head.next.next.prev = head.next;
      head.next.next.next = new DLL('b');
      head.next.next.next.prev = head.next.next;
      head.next.next.next.next = new DLL('a');
      head.next.next.next.next.prev = head.next.next.next;
      
      System.out.println(linkedListPalindrome(head)); //true
   }
   
   /**
   * Checks whether a given doubly linked list is a palindrome
   *
   * @param head The start of a doubly linked list
   * @return True if the linked list is a palindrome, false otherwise
   */
   static boolean linkedListPalindrome(DLL head){
      DLL low = head;
      DLL high = head;
      while(high.next != null){
         high = high.next;
      }
      
      while(low != high && low.prev != high){
         if(low.data != high.data){
            return false;
         }
         low = low.next;
         high = high.prev;
      }
      return true;
   }
}

class DLL{
   char data;
   DLL next;
   DLL prev;
   
   public DLL(char data){
      this.data = data;
   }
   
   public String toString(){
      return  data + " <-> " + next;
   }
}