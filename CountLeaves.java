/* Given a Binary Tree of size N , You have to count leaves in it. */

class CountLeaves{
   public static void main(String[] args){
      TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      root.left.left = new TreeNode(4);
      root.left.right = new TreeNode(5);
      root.right.left = new TreeNode(6);
      root.right.right = new TreeNode(7);
      System.out.println(root);
      /*          1
                /   \
               2     3
             /  \   /  \
            4    5 6    7
            
      */
      
      System.out.println(countLeaves(root)); //4
   }
   
   
   /**
   * Counts the number of leaves in a given binary tree
   *
   * @param root The root of a binary tree
   * @return An integer containing the number of leaves
   */
   static int countLeaves(TreeNode root){
      if(root.left == null && root.right == null){
         return 1;
      }
      int result = 0;
      if(root.left != null){
         result += countLeaves(root.left);
      }    
      if(root.right != null){
         result += countLeaves(root.right);
      }
      return result;
   }
}

class TreeNode{
   int data;
   TreeNode left;
   TreeNode right;
   
   public TreeNode(int data){
      this.data = data;
   }
   
   public String toString(){
      return data + "(" + left + ", " + right + ")";
   }
}