/* Given two binary trees, the task is to find if both of them
are identical or not. */

class IdenticalTrees{
   public static void main(String[] args){
      TreeNode t1 = new TreeNode(1);
      t1.left = new TreeNode(2);
      t1.right = new TreeNode(3);
   
      TreeNode t2 = new TreeNode(1);
      t2.left = new TreeNode(2);
      t2.right = new TreeNode(3);
      
      TreeNode t3 = new TreeNode(1);
      t3.left = new TreeNode(3);
      t3.right = new TreeNode(2);
      
      System.out.println(identicalTrees(t1, t2)); //true
      System.out.println(identicalTrees(t1, t3)); //false
   }
   
   /**
   * Compares two binary trees for equality
   * 
   * @param t1 A binary tree to be compared
   * @param t2 A binary tree to be compared
   * @return A boolean that is true when t1 == t2 and false otherwise
   */
   static boolean identicalTrees(TreeNode t1, TreeNode t2){
      if(t1 == null && t2 == null){
         return true;
      }else if((t1 == null && t2 != null) || (t2 == null && t1 != null) || t1.data != t2.data){
         return false;
      }
      return identicalTrees(t1.left, t2.left) && identicalTrees(t1.right, t2.right);
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
