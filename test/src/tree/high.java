package tree;

import java.util.*;

public class high {
    /*  
     * �����������ȣ��߶ȣ� �ݹ�ⷨ�� O(n)  
     * ��1�����������Ϊ�գ������������Ϊ0   
     * ��2�������������Ϊ�գ������������ = max(��������ȣ� ���������) + 1  
     */   
    public static int getDepthRec(TreeNode root) {    
        if (root == null) {    
            return 0;    
        }    
     
        int leftDepth = getDepthRec(root.left);    
        int rightDepth = getDepthRec(root.right);    
        return Math.max(leftDepth, rightDepth) + 1;    
    }    
         
    /*  
     * �����������ȣ��߶ȣ� �����ⷨ�� O(n)  
     * ��һ��Queue �����������  ÿһ���1���� 
     */   
    public static int getDepth(TreeNode root) {    
        if(root == null){    
            return 0;    
        }    
             
        int depth = 0;                          // ���    
        int currentLevelNodes = 1;      // ��ǰLevel��node������    
        int nextLevelNodes = 0;         // ��һ��Level��node������    
             
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();    
        queue.add(root);    
             
        while( !queue.isEmpty() ){    
            TreeNode cur = queue.remove();      // �Ӷ�ͷλ���Ƴ�    
            currentLevelNodes--;            // ���ٵ�ǰLevel node������    
            if(cur.left != null){               // ��������ӣ��ӵ���β    
                queue.add(cur.left);    
                nextLevelNodes++;           // ��������һ��Level node������    
            }    
            if(cur.right != null){          // ������Һ��ӣ��ӵ���β    
                queue.add(cur.right);    
                nextLevelNodes++;    
            }    
                 
            if(currentLevelNodes == 0){ // ˵���Ѿ������굱ǰ������нڵ�    
                depth++;                       // ���Ӹ߶�    
                currentLevelNodes = nextLevelNodes;     // ��ʼ����һ��ı���    
                nextLevelNodes = 0;    
            }    
        }    
             
        return depth;    
    }    
         
}
