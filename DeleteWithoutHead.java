/*
You are given a pointer/reference to the node which is to be deleted from the linked list of N nodes. 
The task is to delete the node. Pointer/ reference to head node is not given. 
Note: No head reference is given to you. 
It is guaranteed that the node to be deleted is not a tail node in the linked list.
*/

class DeleteWithoutHead{
   public static void main(String args[]){
      Node one = new Node(1);
      Node two = new Node(2);
      Node three = new Node(3);
      Node four = new Node(4);
      Node five = new Node(5);
      
      one.next = two;
      two.next = three;
      three.next = four;
      four.next = five;
      
      System.out.println("Original: " + one);
      System.out.println("After deleting node: " + deleteNode(one, four));      
   }
   
   /**
   * Deletes a given node in a linked list.
   * Note that we pass the head of linked 
   * list in so that we can return the new 
   * list, it is not used for any other purpose.
   *
   * @param head The head of the list
   * @param node The node to be deleted
   * @return The head of the new linked list
   */
   static Node deleteNode(Node head, Node node){
      if(head == node){
         return head.next;
      }
      if(node != null){
         if(node.next == null){
            System.out.println("Cannot delete last node of linked list");
         }else{
            node.data = node.next.data;
            node.next = node.next.next;
         }
      }
      return head;
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
