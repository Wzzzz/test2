package binarytree;

import java.util.*;
//Breadth First Search广度优先搜索//
//按层次遍历//
//not recursion非递归  队列实现//
public class test2 {
	public static void DFStree(TreeNode root)
	{ 
	  Queue<TreeNode> queue = new LinkedList<TreeNode>();
	  queue.offer(root);
	  while(!queue.isEmpty())
	  {TreeNode p = queue.poll();
	   System.out.println(p.val);   
	   if(p.left != null) queue.offer(p.left);
	   if(p.right != null) queue.offer(p.right);  
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

