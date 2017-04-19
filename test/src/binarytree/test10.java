package binarytree;

/*class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
*
*
*二叉查找树插入过程
*
*/
public class test10 {
	public static TreeNode insert(int data,TreeNode root){  
	TreeNode t = new TreeNode(data); 
	if(root == null)  return t;
    if(data<root.val) 
		root.left = insert(data,root.left); 
	else if(data>root.val) 
	    root.right = insert(data,root.right);
    return root;
	} 
	
    public static void main(String[] args){
    	TreeNode root = null;
        root =  insert(4,root); 
        root  = insert(3,root);
        root  = insert(6,root);
        root  = insert(8,root);
        root  = insert(10,root);
        while(root!=null)
        {
         System.out.println(root.val);
         root = root.left;	
         }
    } 
}
