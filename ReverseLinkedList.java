/*
This problem was recently asked by Google:
Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?
Example:
Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
*/

class ReverseLinkedList{
   public static void main(String[] args){
      Node root = new Node(0);
      root.next = new Node(1);
      root.next.next = new Node(2);
      root.next.next.next = new Node(3);
      root.next.next.next.next = new Node(4);
      System.out.println(root);
      System.out.println(reverseLinkedList(root));
   }
   
   /**
   * Reverses a linked list
   *
   * @param root The start of the linked list
   * @return The start of the reversed linked list
   */
   static Node reverseLinkedList(Node root){
      if(root == null){
         return null;
      }else if(root.next == null){
         return root;
      }
      Node tmp = reverseLinkedList(root.next);
      root.next.next = root;
      root.next = null;
      return tmp;
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