package binarytree;

public class test12 {
		
    //找出一个树中节点之间最大值
	public static int Distance(TreeNode t){
	   	if(t == null)
		  return 0;
		return Math.max(Distance(t.left),Distance(t.right))+1;
	}
		
	public static int FindmaxDistance(TreeNode t){
	if(t == null)	
		return 0;
	if(Distance(t.left)+Distance(t.right)>Math.max(FindmaxDistance(t.left),FindmaxDistance(t.right)))	
	  return Distance(t.left)+Distance(t.right);
	else
	  return Math.max(FindmaxDistance(t.left),FindmaxDistance(t.right));	
	}
	
	public static void main(String[] args){	
    
        TreeNode t1= new TreeNode(1);
        TreeNode t2= new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4= new TreeNode(4);
        TreeNode t5= new TreeNode(5);
        TreeNode t6= new TreeNode(6);
        TreeNode t7= new TreeNode(7);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.left=t6;
        t3.right=t7;
        t4.left =null;
        t4.right=null;
        t6.left=null;
        t6.right=null;
        t7.left=null;
        t7.right=null;	
        System.out.println(FindmaxDistance(t1));
    }
}
