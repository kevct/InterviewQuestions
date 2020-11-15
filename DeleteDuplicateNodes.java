/*
This problem was recently asked by Twitter:
Given a linked list, remove all duplicate values from the linked list.
For instance, given 1 -> 2 -> 3 -> 3 -> 4, then we wish to return the 
linked list 1 -> 2 -> 4.
*/
class DeleteDuplicateNodes{
   public static void main(String[] args){
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(2);
      head.next.next.next = new Node(3);
      head.next.next.next.next = new Node(4);
      head.next.next.next.next.next = new Node(4);
      
      System.out.println("Original list: " + head);
      System.out.println("New list: " + deleteDuplicateNodes(head));
   }
   
   /**
   * Deletes duplicate nodes in a linked list
   *
   * @param head The head of the linked list
   * @return The head of the new linked list
   */
   static Node deleteDuplicateNodes(Node head){
      Node tmp = head;
      while(tmp.next != null){
         if(tmp.next.data == tmp.data){
            tmp.next = tmp.next.next;
         }else{
            tmp = tmp.next;
         }
      }
      return head;
   }
}

class Node{
   int data;
   Node next;
   
   public Node(int data){
      this.data = data;
   }
   
   public String toString(){
      return data + " -> " + next;
   }
}