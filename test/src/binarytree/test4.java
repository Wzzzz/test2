package binarytree;
//�������//
//recursion�ݹ�ʵ��//
public class test4 {	
	public static void DFStree(TreeNode root)
	{	
		if(root == null)
		 return;
        DFStree(root.left);
		System.out.println(root.val);
        DFStree(root.right);
	} 
}
