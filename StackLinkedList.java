/*
Given K sorted linked lists of different sizes. The task is to merge 
them in such a way that after merging they will be a single sorted linked list.
*/

class StackLinkedList{
   static Node head;
   public static void main(String[] args){
      push(2);
      push(3);
      pop();
      push(4);
      System.out.println(head);
      // 2 -> 4 -> null
   }
   
   /**
   * Pushes a new value into the stack.
   *
   * @param data The data to push into stack
   * @return nothing
   */
   static void push(int data){
      if(head == null){
         head = new Node(data);
      }else{
         Node tmp = head;
         while(tmp.next != null){
            tmp = tmp.next;
         }
         tmp.next = new Node(data);
      }
   }
   
   /**
   * Pops the topmost data from the stack
   * @return nothing
   */
   static void pop(){
      if(head != null){
         if(head.next == null){
            head = null;
         }else{
            Node tmp = head;
            while(tmp.next.next != null){
               tmp = tmp.next;
            }
            tmp.next = null;
         }
      }
   }
}


class Node{
   Node next;
   int data;
   
   public Node(int data){
      this.data = data;
   }
   
   public String toString(){
      return data + " -> " + next;
   }
}