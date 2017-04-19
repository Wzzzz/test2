package binarytree;
//�������   �����//
//not recursion�ǵݹ�ʵ��//

import java.util.Stack;

public class test7 {	
     public static void DFStree(TreeNode root)
	 {
      Stack<TreeNode> stack = new Stack<TreeNode>();
      while( root != null || !stack.isEmpty())
      {
    	while(root != null)  
    	{
    	stack.push(root);   //�Ȱ�һ���ڵ����ȫpush��stack
    	root = root.left;	
    	}  
    	root = stack.pop();  //stackȡ��������� print ��ȡ�����ڵ�print ���תΪ�ұ߽���ѭ��
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
//�Ȱ�һ�������ڵ��������ȫ����ջ   Ȼ������ȡ���ȼ�¼    ���
//Ȼ��ע��ȡ����ÿ���ڵ��Ƿ����Һ���     �еĻ����ظ�ѭ����������