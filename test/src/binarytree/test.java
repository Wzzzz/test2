package binarytree;

import java.util.*;
/*Depth First Search深度优先搜索 
    也是先序遍历的一种特殊实现方法
  not recursion非递归的栈实现
*/
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
public class test {	
	public static void DFStree(TreeNode root)
	{	
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty())
		{TreeNode p = stack.pop();
		 System.out.println(p.val);
		 if(p.right!=null) stack.push(p.right);
		 if(p.left!=null) stack.push(p.left);
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
