package binarytree;
//后序遍历   左右根//
//not recursion非递归实现//

import java.util.Stack;

public class test9 {	
    public static void DFStree(TreeNode root){  
        Stack<TreeNode> stack = new Stack<TreeNode>();  
        TreeNode prev = root;  
        while(root!=null || !stack.isEmpty()){  
            while(root!=null){  
                stack.push(root);  
                root = root.left;  
            }  
            TreeNode temp = stack.peek().right;  
            if(temp == null||temp == prev){  
               root = stack.pop();  
               System.out.println(root.val);
               prev = root;  
               root = null;  
            }else{ root = temp; }     
              
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
         TreeNode t8= new TreeNode(8);
         TreeNode t9= new TreeNode(9);
         TreeNode t10= new TreeNode(10);
         TreeNode t11= new TreeNode(11);
         t1.left=t2;
         t1.right=t3;
         t2.left=t4;
         t2.right=t5;
         t3.left=t6;
         t3.right=t7;
         t4.left =t8;
         t4.right=t9;
         t6.left=null;
         t6.right=t10;
         t7.left=null;
         t7.right=t11;
    	  DFStree(t1);
     } 
}
