package binarytree;
/*
*  ��֪��������� ��������
*/
public class test11 {
	
	//��������ݹ�ʵ��
	public static void postOrder(TreeNode root){	
	 if(root == null) return;
	 postOrder(root.left);
	 postOrder(root.right);
	 System.out.println(root.val);
	}
	
	//�ҳ�ĳ��ֵ�������λ��		
	public static int findindexarray(int a[],int data,int begin,int end){
	for(int i = begin;i<=end;i++){	
	  if(a[i]==data)	
	     return i;
	  }	
	return -1;	
	}
   
	
    //�ҳ����ڵ��ֵ����Ҫ��ֵ����һ����
	public static TreeNode initTree(int preOrder[],int start1,int end1,int inOrder[],int start2,int end2){
    if(start1>end1||start2>end2)
         return null;
    //����ǰ�����������������ڵ�λ��
    int rootData = preOrder[start1];
    TreeNode t = new TreeNode(rootData);
    int rootindex = findindexarray(inOrder,rootData,start2,end2);
    //���������� 
    int offset = rootindex - start2 - 1;  
    t.left = initTree(preOrder,start1+1,start1+1+offset,inOrder,start2,rootindex-1);
    t.right = initTree(preOrder,start1+1+offset+1,end1,inOrder,rootindex+1,end2);
    return t;
    }
	
	
	public static void main(String[] args){	
	int	preOrder[] = {1,2,4,8,9,5,10,3,6,7}; 
	int inOrder[] = {8,4,9,2,10,5,1,6,3,7};
	TreeNode t = initTree(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1);
	postOrder(t);
    }
}
