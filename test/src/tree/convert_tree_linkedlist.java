package tree;

import java.util.*;

public class convert_tree_linkedlist {
	
	
    public static TreeNode convertBST2DLLRec(TreeNode root) {    
        root = convert(root);    
             
        // root����������м�λ�ã����Ҫ�ֶ���root�Ƶ�����ͷ    
        while(root.left != null){    
            root = root.left;    
        }    
        return root;    
    }    
         
    /*  
     *  �ݹ�ת��BSTΪ˫������(DLL)  
     */   
    public static TreeNode convert(TreeNode root){    
        if(root==null || (root.left==null && root.right==null)){    
            return root;    
        }          
        TreeNode tmp = null;    
        if(root.left != null){          // ����������    
            tmp = convert(root.left);    
            while(tmp.right != null){   // Ѱ�����ҽڵ�    
                tmp = tmp.right;    
            }    
            tmp.right = root;       // �����������������root����    
            root.left = tmp;    
        }    
        if(root.right != null){     // ����������    
            tmp = convert(root.right);    
            while(tmp.left != null){    // Ѱ������ڵ�    
                tmp = tmp.left;    
            }    
            tmp.left = root;        // �����������������root����    
            root.right = tmp;    
        }    
        return root;    
    }    
         
    
/*  
 * �������������Ϊ�����˫������ �����ⷨ  
 */   
    public static TreeNode convertBST2DLL(TreeNode root) {    
        if(root == null){    
            return null;    
        }    
        Stack<TreeNode> stack = new Stack<TreeNode>();    
        TreeNode cur = root;        // ָ��ǰ����ڵ�    
        TreeNode old = null;            // ָ��ǰһ������Ľڵ�    
        TreeNode head = null;       // ����ͷ    
             
        while( true ){    
            while(cur != null){     // �����һ���ǿսڵ����е����ӵ�ջ    
                stack.push(cur);    
                cur = cur.left;    
            }    
                 
            if(stack.isEmpty()){    
                break;    
            }                         
            // ��Ϊ��ʱ�Ѿ�û�������ˣ��������ջ��Ԫ��    
            cur = stack.pop();    
            if(old != null){    
                old.right = cur;    
            }    
            if(head == null){       // /��һ���ڵ�Ϊ˫������ͷ�ڵ�    
                head = cur;    
            }    
                 
            old = cur;          // ����old    
            cur = cur.right;    // ׼������������    
        }              
        return head;    
    }    
}
