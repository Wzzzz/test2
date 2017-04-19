package binarytree;
//中序遍历   左根右//
//not recursion非递归实现//

import java.util.Stack;

public class test7 {	
     public static void DFStree(TreeNode root)
	 {
      Stack<TreeNode> stack = new Stack<TreeNode>();
      while( root != null || !stack.isEmpty())
      {
    	while(root != null)  
    	{
    	stack.push(root);   //先把一个节点左边全push进stack
    	root = root.left;	
    	}  
    	root = stack.pop();  //stack取出来最左边 print 再取出根节点print 最后转为右边进入循环
    	System.out.println(root.val);   
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
//先把一个树根节点的左孩子先全部进栈   然后依次取出先记录    左根
//然后注意取出的每个节点是否有右孩子     有的话再重复循环上述过程