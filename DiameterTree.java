/*
Given a binary tree, you need to compute the length of the diameter of the tree. 
The diameter of a binary tree is the length of the longest path between any two 
nodes in a tree. This path may or may not pass through the root.
*/
import java.lang.Math;

class DiameterTree{
   public static void main(String[] args){
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(1);
      root.left.left = new TreeNode(1);
      root.left.right = new TreeNode(1);
      root.left.right.left = new TreeNode(1);
      root.left.right.right = new TreeNode(1);
      root.right = new TreeNode(1);
      root.right.right = new TreeNode(1);
      root.right.right.right = new TreeNode(1);
      root.right.right.right.left = new TreeNode(1);
      root.right.right.right.left.right = new TreeNode(1);
      root.right.right.right.right = new TreeNode(1);
      
      /*
                1
              /   \
             1     1
            / \     \
           1   1     1
              / \     \
             1   1     1
                      / \
                     1   1
                      \
                       1
      */
      
      System.out.print(TreeNode.diameter(root)); //9
   }
}

class TreeNode{
   int data;
   TreeNode left;
   TreeNode right;
   
   public TreeNode(int data){
      this.data = data;
   }
   
   /**
   * Finds height of a given tree
   *
   * @param root
   * @return The height of the tree
   */
   static int height(TreeNode root){
      if(root == null){
         return 0;
      }
      return 1 + Math.max(height(root.left), height(root.right));
   }
   
   /**
   * Finds the diamater of a tree
   *
   * @param root
   * @return the diamater of the tree
   */
   static int diameter(TreeNode root){
      if(root == null){
         return 0;
      }
      int diameterRoot = 1 + height(root.left) + height(root.right);
      int diameterLeft = diameter(root.left);
      int diameterRight = diameter(root.right);
      return Math.max(diameterRoot, Math.max(diameterLeft, diameterRight));
   }
}
