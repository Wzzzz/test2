package sort;

import java.util.Arrays;
//heap sort 堆排序//
/*
 假设某个元素为序号为i(Java数组从0开始,i为0到n-1);
 如果它有左子树,那么左子树的位置是2i+1,如果有右子树,右子树的位置是2i+2 
如果有父节点，父节点的位置是(n-1)/2取整
分为最大堆和最小堆，最大堆的任意子树根节点不小于任意子结点，最小堆的根节点不大于任意子结点
对于N个数的数组，采用N次insert(上滤)构建堆O(N)    
以及N次deleteMin(下滤) 每次O(logN) 一共O(NlogN) 完成排序  
*/
public class test3 {
	public static void heapadjust(int a[],int i,int length)  
	{                                                      //实现了在一个无序堆 一个节点的下滤 大的节点往上走 替代父节点
	 int tmp;	
	 int child = 2*i+1;
	 for(tmp = a[i];child<length;i = child,child = child*2+1)	
	   {if(child+1<length && a[child]<a[child+1])
		  child++;
		if(tmp < a[child])
		  a[i] = a[child];
		 else break;
		}
	   a[i] = tmp;
     }
	public static void heapsort(int a[])
	{
     for(int i = a.length/2;i>=0;i--)  //建立初始堆 保证所有节点和子节点之间大小关系
		heapadjust(a,i,a.length);
     for(int i = a.length-1;i>0;i--)
     {	int tmp = a[i];                     //已知初始堆中a[0]是所有中最大的值
    	a[i] = a[0];
    	a[0] = tmp;
    	heapadjust(a,0,i);                  //把a[0]取出在a[i]位置  且将a[0]与剩下的i-1个点进行下滤
     }                                      //结果每次把最大的值放在最后  然后对前面的再下滤  恢复为又一个初始堆
	}
	public static void main(String[] args) {
	int[] aa = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,2,3,4,6,0,5};
	heapsort(aa);
	System.out.println(Arrays.toString(aa));
  }   
}
