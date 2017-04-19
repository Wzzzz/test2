package binarytree;
//先序遍历//
//recursion非递归实现//
public class test3 {	
	public static void DFStree(TreeNode root)
	{	
		if(root == null)
		 return;
		System.out.println(root.val);
        DFStree(root.left);
        DFStree(root.right);
	} 
}
