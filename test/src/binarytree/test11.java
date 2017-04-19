package binarytree;
/*
*  已知先序和中序 求后序遍历
*/
public class test11 {
	
	//后序遍历递归实现
	public static void postOrder(TreeNode root){	
	 if(root == null) return;
	 postOrder(root.left);
	 postOrder(root.right);
	 System.out.println(root.val);
	}
	
	//找出某个值在数组的位置		
	public static int findindexarray(int a[],int data,int begin,int end){
	for(int i = begin;i<=end;i++){	
	  if(a[i]==data)	
	     return i;
	  }	
	return -1;	
	}
   
	
    //找出根节点的值还需要把值赋给一个树
	public static TreeNode initTree(int preOrder[],int start1,int end1,int inOrder[],int start2,int end2){
    if(start1>end1||start2>end2)
         return null;
    //根据前序遍历找中序遍历根节点位置
    int rootData = preOrder[start1];
    TreeNode t = new TreeNode(rootData);
    int rootindex = findindexarray(inOrder,rootData,start2,end2);
    //构建左子树 
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
