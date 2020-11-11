/*
This problem was recently asked by Twitter:
Given a tree, find if the binary tree is height balanced or not. A height 
balanced binary tree is a tree where every node's 2 subtree do not differ in 
height by more than 1.
*/
import java.lang.Math;

class HeightBalanced{
   public static void main(String[] args){
      /*   1
          / \
         2   3
        /
       4  
      */
      TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4)), new TreeNode(3));
      System.out.println(root);
      System.out.println(heightBalanced(root)); // True
   }
   
   /**
   * Checks to see if a binary tree is height balanced
   *
   * @param root The root of the binary tree
   * @return True if the tree is height balanced, false otherwise
   */
   static boolean heightBalanced(TreeNode root){
      if(root != null){
         if(!(Math.abs(height(root.left)-height(root.right))<=1 && heightBalanced(root.left) && heightBalanced(root.right))){
            return false;
         }
      }
      return true;
   }
   
   /**
   * Gets the length of a binary tree
   *
   * @param root The root of the binary tree
   * @return The number of nodes in the longest path of a tree
   */
   static int height(TreeNode root){
      if(root == null){
         return 0;
      }
      return 1 + Math.max(height(root.left), height(root.right));
   }
}

class TreeNode{
   int data;
   TreeNode left;
   TreeNode right;
   
   public TreeNode(int data){
      this.data = data;
   }
   public TreeNode(int data, TreeNode left, TreeNode right){
      this.data = data;
      this.left = left;
      this.right = right;
   }
   public TreeNode(int data, TreeNode left){
      this.data = data;
      this.left = left;
   }
   
   public String toString(){
      return data + "(" + this.left + ", " + this.right + ")";
   }
}