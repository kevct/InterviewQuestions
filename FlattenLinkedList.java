/*
Given a Linked List of size N, where every node represents a linked list and contains two pointers of its type:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Flatten the lists into a single linked list. The flattened linked list should also be sorted. 
*/

class FlattenLinkedList{
   public static void main(String[] args){
      LinkedList node = new LinkedList(5);
      node.bottom = new LinkedList(7);
      node.bottom.bottom = new LinkedList(8);
      node.bottom.bottom.bottom = new LinkedList(30);
      node.next = new LinkedList(10);
      node.next.bottom = new LinkedList(20);
      node.next.next = new LinkedList(19);
      node.next.next.bottom = new LinkedList(22);
      node.next.next.bottom.bottom = new LinkedList(50);
      node.next.next.next = new LinkedList(28);
      node.next.next.next.bottom = new LinkedList(35);
      node.next.next.next.bottom.bottom = new LinkedList(40);
      node.next.next.next.bottom.bottom.bottom = new LinkedList(45);
      
      /*
      5 -> 10 -> 19 -> 28
      |     |     |     | 
      7     20    22   35
      |           |     | 
      8          50    40
      |                 | 
      30               45
      */
      
      System.out.println(flattenLinkedList(node));
      //5-> 7-> 8-> 10-> 19-> 20-> 22-> 28-> 30-> 35-> 40-> 45-> 50
   }
   
   /**
   * Flattens a linked list
   * 
   * @param node The start of the linked list
   * @return The flattened linked list
   */
   static LinkedList flattenLinkedList(LinkedList node){
      LinkedList cur = node;
      while(cur != null){
         if(cur.bottom != null){
            if(cur.next != null){
               LinkedList tmp = cur;
               LinkedList tmp1 = cur.next;
               while(tmp1 != null && cur.bottom.data > tmp1.data){
                  tmp = tmp.next;
                  tmp1 = tmp1.next;
               }
               tmp.next = cur.bottom;
               cur.bottom.next = tmp1;
            }else{
               cur.bottom.next = cur.next;
               cur.next = cur.bottom;
            }
         }
         cur = cur.next;
      }
      return node;
   }  
}

class LinkedList{
   LinkedList next;
   LinkedList bottom;
   int data;
   
   public LinkedList(int data){
      this.data = data;
   }
   
   public String toString(){
      return data + "-> " + next;
   }
}