package tree;

import java.util.*;

public class convert_tree_linkedlist {
	
	
    public static TreeNode convertBST2DLLRec(TreeNode root) {    
        root = convert(root);    
             
        // root会在链表的中间位置，因此要手动把root移到链表头    
        while(root.left != null){    
            root = root.left;    
        }    
        return root;    
    }    
         
    /*  
     *  递归转换BST为双向链表(DLL)  
     */   
    public static TreeNode convert(TreeNode root){    
        if(root==null || (root.left==null && root.right==null)){    
            return root;    
        }          
        TreeNode tmp = null;    
        if(root.left != null){          // 处理左子树    
            tmp = convert(root.left);    
            while(tmp.right != null){   // 寻找最右节点    
                tmp = tmp.right;    
            }    
            tmp.right = root;       // 把左子树处理后结果和root连接    
            root.left = tmp;    
        }    
        if(root.right != null){     // 处理右子树    
            tmp = convert(root.right);    
            while(tmp.left != null){    // 寻找最左节点    
                tmp = tmp.left;    
            }    
            tmp.left = root;        // 把右子树处理后结果和root连接    
            root.right = tmp;    
        }    
        return root;    
    }    
         
    
/*  
 * 将二叉查找树变为有序的双向链表 迭代解法  
 */   
    public static TreeNode convertBST2DLL(TreeNode root) {    
        if(root == null){    
            return null;    
        }    
        Stack<TreeNode> stack = new Stack<TreeNode>();    
        TreeNode cur = root;        // 指向当前处理节点    
        TreeNode old = null;            // 指向前一个处理的节点    
        TreeNode head = null;       // 链表头    
             
        while( true ){    
            while(cur != null){     // 先添加一个非空节点所有的左孩子到栈    
                stack.push(cur);    
                cur = cur.left;    
            }    
                 
            if(stack.isEmpty()){    
                break;    
            }                         
            // 因为此时已经没有左孩子了，所以输出栈顶元素    
            cur = stack.pop();    
            if(old != null){    
                old.right = cur;    
            }    
            if(head == null){       // /第一个节点为双向链表头节点    
                head = cur;    
            }    
                 
            old = cur;          // 更新old    
            cur = cur.right;    // 准备处理右子树    
        }              
        return head;    
    }    
}
