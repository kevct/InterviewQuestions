/*
This problem was recently asked by Amazon:
Given a sorted linked list of integers, remove all the 
duplicate elements in the linked list so that all elements in the linked list are unique.
*/

class Node{
   int data;
   Node next = null;
   
   /**
   * Constructor to create a linked list node.
   *
   * @param data This is the value of the linked list node to be initialized
   */
   public Node(int data){
      this.data = data;
   }
   
   /**
   * Prints the node's value in an easy to read format.
   *
   * @return A string containing the node's value and the next node's value (null if next node is null)
   */
   public String toString(){
      return data + " -> " + next;
   }
   
   
   /**
   * Prints the node's value in an easy to read format.
   *
   * @param n The start of the linked list to process
   * @return The start of the linked list
   */
   public Node removeDuplicateNodes(Node n){
      Node prev = n;
      Node cur = n.next;
      
      while(cur != null){
         if(cur.data == prev.data){
            cur = cur.next;
            prev.next = cur;
         }else{
            prev = prev.next;
            cur = cur.next;
         }
      }
      
      return n;
   }
}

class RemoveDuplicateLinkedList{
   public static void main(String[] args){
      Node node = new Node(1);
      node.next = new Node(2);
      node.next.next = new Node(2);
      node.next.next.next = new Node(3);
      node.next.next.next.next = new Node(3);
      System.out.println(node);
      //1 -> 2 -> 2 -> 3 -> 3
      
      System.out.println(node.removeDuplicateNodes(node));
      ////1 -> 2 -> 3   
   }
}