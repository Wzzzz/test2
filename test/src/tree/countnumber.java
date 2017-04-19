package tree;

import java.util.*;

/*  
 * ��������еĽڵ�����ݹ�ⷨ�� O(n)  
 * ��1�����������Ϊ�գ��ڵ����Ϊ0   
 * ��2�������������Ϊ�գ��������ڵ���� = �������ڵ���� +  
 *     �������ڵ���� + 1  
 */ 

/* ������һ������ �ѽڵ���ȱ���һ��
 *           
 */ 

public class countnumber {
	
	
	
    public  int getNodeNumRec(TreeNode root) {     //�ݹ�������ڵ���� = �������ڵ���� +�������ڵ���� + 1 
        if (root == null) {    
            return 0;    
        } else {    
            return getNodeNumRec(root.left) + getNodeNumRec(root.right) + 1;    
        }    
    }
    
    
    
    public int getNodeNum(TreeNode root) {     //����  ������ȱ���һ��
        if(root == null){    
            return 0;    
        }    
        int count = 1;    
        Queue<TreeNode> queue = new LinkedList<TreeNode>();    
        queue.add(root);    
             
        while(!queue.isEmpty()){    
            TreeNode cur = queue.remove();      // �Ӷ�ͷλ���Ƴ�    
            if(cur.left != null){           // ��������ӣ��ӵ���β    
                queue.add(cur.left);    
                count++;    
            }    
            if(cur.right != null){      // ������Һ��ӣ��ӵ���β    
                queue.add(cur.right);    
                count++;    
            }    
        }    
             
        return count;    
    }    

}
