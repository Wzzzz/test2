package sort;

import java.util.Arrays;
//fast sort快速排序//
//方法不太对  应该左右两指针一起
public class test2 {
	public static void swap(int a[],int i,int j)
	{
	 int tmp = a[i];
	 a[i] = a[j];
	 a[j] = tmp;		 
	}
	public static void sort(int a[],int left,int right)
	{	
	  if(left>=right)
		  return;
	  int key = left;
	  for(int i = left+1;i<=right;i++)
	   {
		 if(a[i]<a[left])
		 { key = key+1;
		   swap(a,key,i);
		 } 
	   }
	  swap(a,left,key); 
	  sort(a,left,key-1);
	  sort(a,key+1,right);
	}
	public static void main(String[] args) {
	int[] aa = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6};
	sort(aa,0,aa.length-1);
	System.out.println(Arrays.toString(aa));
  }   
}
