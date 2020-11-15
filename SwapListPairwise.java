/*
Given a singly linked list, write a function to swap elements pairwise.

Input : 1->2->3->4->5->6->NULL
Output : 2->1->4->3->6->5->NULL
*/

import java.util.ArrayList;

class SwapListPairwise{
   public static void main(String[] args){
      Node head = new Node(1);
      Node tmp = head;
      for(int i = 2; i <= 7; i++){
         tmp.next = new Node(i);
         tmp = tmp.next;
      }
      //1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null
      
      Node result = swapListPairwise(head);
      System.out.println(result);
      //2 -> 1 -> 4 -> 3 -> 6 -> 5 -> 7 -> null
   }
   
   /**
   * Swaps a given linked list pairwise.
   *
   * @param head The head of the linked list
   * @return The pairwise swapped linked list
   */
   static Node swapListPairwise(Node head){
      ArrayList<Node> arr = new ArrayList<Node>();
      Node tmp = head;
      while(tmp != null){
         arr.add(tmp);
         tmp = tmp.next;
      }
      //Pairwise swap elements
      for(int i = 0; i < arr.size()-1; i+=2){
         tmp = arr.get(i+1);
         arr.set(i+1, arr.get(i));
         arr.set(i, tmp);
      }
      //Set pointers
      for(int i = 0; i < arr.size()-1; i++){
         arr.get(i).next = arr.get(i+1);
      }
      arr.get(arr.size()-1).next = null;
      return arr.get(0);
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