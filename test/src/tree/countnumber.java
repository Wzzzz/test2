package tree;

import java.util.*;

/*  
 * 求二叉树中的节点个数递归解法： O(n)  
 * （1）如果二叉树为空，节点个数为0   
 * （2）如果二叉树不为空，二叉树节点个数 = 左子树节点个数 +  
 *     右子树节点个数 + 1  
 */ 

/* 或者用一个队列 把节点深度遍历一遍
 *           
 */ 

public class countnumber {
	
	
	
    public  int getNodeNumRec(TreeNode root) {     //递归二叉树节点个数 = 左子树节点个数 +右子树节点个数 + 1 
        if (root == null) {    
            return 0;    
        } else {    
            return getNodeNumRec(root.left) + getNodeNumRec(root.right) + 1;    
        }    
    }
    
    
    
    public int getNodeNum(TreeNode root) {     //迭代  深度优先遍历一遍
        if(root == null){    
            return 0;    
        }    
        int count = 1;    
        Queue<TreeNode> queue = new LinkedList<TreeNode>();    
        queue.add(root);    
             
        while(!queue.isEmpty()){    
            TreeNode cur = queue.remove();      // 从队头位置移除    
            if(cur.left != null){           // 如果有左孩子，加到队尾    
                queue.add(cur.left);    
                count++;    
            }    
            if(cur.right != null){      // 如果有右孩子，加到队尾    
                queue.add(cur.right);    
                count++;    
            }    
        }    
             
        return count;    
    }    

}
