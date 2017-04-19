package binarytree;
//前序遍历   根左右//
//not recursion非递归实现//

import java.util.Stack;

public class test6 {	
     public static void DFStree(TreeNode root)
	 {
    	 Stack<TreeNode> stack = new Stack<TreeNode>();
		 while(root!=null || !stack.isEmpty())
		 {
		   while(root!=null)  //对于任意节点  把根print 再把左边print 然后push进stack
		   {
			System.out.println(root.val);   
		    stack.push(root);
		    root = root.left;
		   }
			root = stack.pop();      //然后把stack pop() 取出右节点 返回上个部分
			root = root.right;                  
		  }
	 }
     public static void main(String[] args){
         TreeNode t1= new TreeNode(1);
         TreeNode t2= new TreeNode(2);
         TreeNode t3= new TreeNode(3);
         TreeNode t4= new TreeNode(4);
         TreeNode t5= new TreeNode(5);
         TreeNode t6= new TreeNode(6);
         TreeNode t7= new TreeNode(7);
         t1.left=t2;
         t1.right=t3;
         t2.left=t4;
         t2.right=t5;
         t3.left=t6;
         t3.right=t7;
         t4.left =null;
         t4.right=null;
         t6.left=null;
         t6.right=null;
         t7.left=null;
         t7.right=null;
         DFStree(t1);
     }
}
