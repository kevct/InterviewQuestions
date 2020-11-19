/*
Given a singly linked list of N nodes. The task is to find the middle of the linked list. 
For example, if given linked list is 1->2->3->4->5 then the output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print the second middle element. 
For example, if given linked list is 1->2->3->4->5->6 then the output should be 4.
*/

class MiddleLinkedList{
   public static void main(String[] args){
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);
      
      System.out.println(middleLinkedList(head)); //3
      
      head.next.next.next.next.next = new Node(6);
      System.out.println(middleLinkedList(head)); //4
   
   }
   
   /**
   * Finds the middle of the linked list
   *
   * @param head The head of the linked list
   * @return The value of the middle node of the linked list
   */
   static int middleLinkedList(Node head){
      if(head == null){
         return -1;
      }
      Node result = head;
      Node byTwo = head;
      
      while(byTwo != null && byTwo.next != null){
         result = result.next;
         byTwo = byTwo.next.next;
      }
      return result.data;
   }
}

class Node{
   Node next;
   int data;
   
   public Node(int data){
      this.data = data;
   }
}