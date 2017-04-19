package sort;
import java.util.*;
/*8大排序算法+位图算法*/
public class eightsort {
  //交换数组的ij两个位置
	public static void swap(int a[],int i,int j){
	 int tmp = a[i];
	 a[i] = a[j];
	 a[j] = tmp;
	}
  /*插入排序:
   * 最好时间：O(n)  平均时间：O(n^2)  最坏时间：O(n^2)
   * 辅助存储：O(1)  稳定性：稳定    备注：大部分有序时效果好！！
   * */	
	public static void insertsort(int a[]){
	 for(int i = 1;i<a.length;i++)  
	 {int tmp = a[i];
	  int j;     
	  for(j = i;j>=1&&a[j-1]>tmp;j--)
		 a[j]=a[j-1];
	  a[j] = tmp;
	 }		
	}
	
 /*选择排序:
  * 最好时间：O(n^2)  平均时间：O(n^2)  最坏时间：O(n^2)
  * 辅助存储：O(1)  稳定性：不稳定    备注：n小时比较好
  * */	
	public static void selectsort(int a[]){
	  for(int i = 0;i<a.length;i++)	
	  { int tmp = a[i];
        int flag = i;	  
		for(int j = i+1;j<a.length;j++)
		{
		  if(a[j]<tmp)
		  { tmp = a[j];
		    flag = j;
		  }
		}
		a[flag] = a[i];
		a[i] = tmp;
	  }	
	}
	
/* 冒泡排序:
 * 最好时间：O(n)  平均时间：O(n^2)  最坏时间：O(n^2)
 * 辅助存储：O(1)  稳定性：稳定    备注：n小时比较好
 * */
	public static void bubblesort(int a[]){
	for(int i = a.length-1;i>=0;i--)
     {
	  for(int j = 1;j<=i;j++)
	    if(a[j]<a[j-1])
		 swap(a,j,j-1);
	 }
	}
	
/* 快速排序:
 * 最好时间：O(nlogn)  平均时间：O(nlogn)  最坏时间：O(n^2)
 * 辅助存储：O(nlogn)  稳定性：不稳定    备注：n大时较好
 * 对于大型的，随机的输入具有最快的排序速度
 * 快排基准的选择
 * */
    public static void quicksort(int a[]){
    	qksort(a,0,a.length-1);
    }
    
    private static void qksort(int a[],int left,int right){
    if(left>=right)
	    return;
	int key = partition(a,left,right);	//int key = partition1(a,left,right);
    qksort(a,left,key-1);
    qksort(a,key+1,right); 	
    }
    
    private static int partition(int a[],int left,int right){ 
     int i = left;
     int j = right;
     int compare = a[left];
     while(i<j){
     while(i<j&&a[j]>=a[left]) j--;	 
     while(i<j&&a[i]<=a[left]) i++;
     if(i<j) swap(a,i,j);
     }
     swap(a,left,i);
     a[i]=compare;  
     return i;
    }
       
    @SuppressWarnings("unused")
	private static int partition1(int a[],int left,int right){ 
        int key = left;
        for(int i = left+1;i<=right;i++)
           if(a[i]<a[left])
           {key++;
        	swap(a,key,i);
            }
        swap(a,left,key);     
        return key;
       }
/* 堆排序:
 * 最好时间：O(nlogn)  平均时间：O(nlogn)  最坏时间：O(nlogn)
 * 辅助存储：O(1)  稳定性：不稳定    备注：n大时较好
 * */    
   public static void heapadjust(int a[],int i,int length){
	int tmp = a[i];
	int j;
	for(j = 2*i+1;j<length;j = j*2+1)
    {if(a[j]<a[j+1] && j+1<length)
	   j++;
     if(a[j]>tmp)
       a[i] = a[j];
     else break;
     i = j;
    }
	a[i] = tmp;
   }
   public static void heapsort(int a[]){
   for(int i = a.length/2;i>=0;i--)    //构建堆(最大顶堆) 对前一半的元素实现下滤（值大的节点向上走） 切记是递减  
    heapadjust(a,i,a.length);          //因为下滤  需要先考虑子节点关系 一个节点子堆为最大顶堆  再执行下滤才是最大顶堆 
   for(int i = a.length-1;i>=0;i--)
   {swap(a,0,i);                        //从后往前将每个元素和堆顶元素互换 则最后这个元素为最大值
    heapadjust(a,0,i-1 );                  //对着i个元素实现一次下滤
   }   
   }
   
   /* 希尔排序:
    * 最好时间：O(n)  平均时间：O(nlogn)  最坏时间：O(n^s(1<s<2))
    * 辅助存储：O(1)  稳定性：不稳定    备注：s是所选分组
    * */ 
   
   public static void shellsort(int a[]){
      for(int h = a.length/2;h>0;h = h/2){
         for(int i = h;i<a.length;i++){
    	    int tmp = a[i];
    	    int j;
         	for(j = i;j>=h&&a[j-h]>tmp;j = j -h) 
         		a[j] = a[j-h];
         	a[j] = tmp;	 	 
         } 
      }	  
   }
    
    
 /*输入主函数*/   
	public static void main(String[] args) {
	int[] a = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	insertsort(a);
	System.out.println("insertsort：" + Arrays.toString(a));
	int[] b = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	selectsort(b);
	System.out.println("selectsort：" + Arrays.toString(b));
	int[] c = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	bubblesort(c);
	System.out.println("bubblesort：" + Arrays.toString(c));
	int[] d = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	quicksort(d);
	System.out.println("quicksort：  " + Arrays.toString(d));
	int[] e = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	heapsort(e);
	System.out.println("heapsort：    " + Arrays.toString(e));
	int[] f = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	shellsort(f);
	System.out.println("shellsort：    " + Arrays.toString(f));
  }   
}
