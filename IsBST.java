/*
Given a binary tree. Check whether it is a BST or not.
*/

class IsBST{
   public static void main(String[] args){
      BTNode root = new BTNode(5);
      root.right = new BTNode(7);
      root.right.left = new BTNode(6);
      root.right.right = new BTNode(8);
      root.left = new BTNode(4);
      root.left.left = new BTNode(2);
      root.left.left.right = new BTNode(3);
      System.out.print(root + "\n" + isBST(root)); //true
      /*
        5
       / \
      4   7
     /   / \
    2   6   8
     \
      3
      */
      
   }
   
   /**
   * Checks to see if a given tree is a binary search tree.
   *
   * @param root The root of the tree
   * @return True if the tree is a bst, false otherwise
   */
   static boolean isBST(BTNode root){      
      return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }
   
   /**
   * Helper function for isBST
   *
   * @param root The root of the tree
   * @param min The min value of the range
   * @param max The max value of the range
   * @return True if the tree is a bst, false otherwise
   */
   static boolean isBSTHelper(BTNode root, int min, int max){
      if(root == null){
         return true;
      }
      
      if(root.data < min || root.data > max){
         return false;
      }
      
      return isBSTHelper(root.left, min, root.data-1) && isBSTHelper(root.right, root.data+1, max);
   }
}

class BTNode{
   int data;
   BTNode left;
   BTNode right;
   
   public BTNode(int data){
      this.data = data; 
   }
   
   public String toString(){
      return data + "(" + left + ", " + right + ")";
   }
}