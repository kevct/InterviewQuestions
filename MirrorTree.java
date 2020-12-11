/*
Given a Binary Tree. Check whether it is Symmetric or not, i.e. 
whether the binary tree is a Mirror image of itself or not.
*/

class MirrorTree{
   public static void main(String[] args){
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(2);
      root.left.left = new TreeNode(3);
      root.left.right = new TreeNode(4);
      root.right.left = new TreeNode(4);
      root.right.right = new TreeNode(3);
      
      /*
            1
           / \
          2   2
         /\   /\
        3  4 4  3
      */
      
      System.out.print(mirrorTree(root, root));
   }
   
   /**
   * Checks if a given binary tree is a mirror of itself
   *
   * @param t1 The first node to compare
   * @param t2 The second node to compare
   * @return True if the tree is a mirror of itself and false otherwise
   */
   static boolean mirrorTree(TreeNode t1, TreeNode t2){
      if(t1 == null && t2 == null){
         return true;
      }
      if((t1 == null && t2 != null) || (t1 != null && t2 == null) || (t1.data != t2.data)){
         return false;
      }
      
      return mirrorTree(t1.left, t2.right) && mirrorTree(t1.right, t2.left);
      
   }
}


class TreeNode{
   int data;
   TreeNode left;
   TreeNode right;
   
   public TreeNode(int data){
      this.data = data;
   }
}