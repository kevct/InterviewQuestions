/*
This problem was recently asked by LinkedIn:
Given a binary tree, perform an in-order traversal.
*/

class TreeNode{
   int data;
   TreeNode left = null;
   TreeNode right = null;
   
   public TreeNode(int data, TreeNode left, TreeNode right){
      this.data = data;
      this.left = left;
      this.right = right;
   }
   
   public TreeNode(int data){
      this.data = data;
   }
}

class InorderTreeTraversal{
   public static void main(String[] args){
      TreeNode root = new TreeNode(12, new TreeNode(6, new TreeNode(2), new TreeNode(3)), new TreeNode(4, new TreeNode(7), new TreeNode(8)));
      //     12
      //    /  \
      //   6    4
      //  / \   / \
      // 2   3 7   8
      
      InorderTreeTraversal(root);
      //2 6 3 12 7 4 8
   }
   
   /**
   * Prints the inorder traversal of a given tree
   *
   * @param root The root of the tree to be processed
   */
   static void InorderTreeTraversal(TreeNode root){
      if(root != null){
         if(root.left != null){
            InorderTreeTraversal(root.left);
         }
         System.out.print(root.data + " ");
         InorderTreeTraversal(root.right);
      }
   }
}