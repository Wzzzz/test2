package sort;
import java.util.*;
/*8�������㷨+λͼ�㷨*/
public class eightsort {
  //���������ij����λ��
	public static void swap(int a[],int i,int j){
	 int tmp = a[i];
	 a[i] = a[j];
	 a[j] = tmp;
	}
  /*��������:
   * ���ʱ�䣺O(n)  ƽ��ʱ�䣺O(n^2)  �ʱ�䣺O(n^2)
   * �����洢��O(1)  �ȶ��ԣ��ȶ�    ��ע���󲿷�����ʱЧ���ã���
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
	
 /*ѡ������:
  * ���ʱ�䣺O(n^2)  ƽ��ʱ�䣺O(n^2)  �ʱ�䣺O(n^2)
  * �����洢��O(1)  �ȶ��ԣ����ȶ�    ��ע��nСʱ�ȽϺ�
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
	
/* ð������:
 * ���ʱ�䣺O(n)  ƽ��ʱ�䣺O(n^2)  �ʱ�䣺O(n^2)
 * �����洢��O(1)  �ȶ��ԣ��ȶ�    ��ע��nСʱ�ȽϺ�
 * */
	public static void bubblesort(int a[]){
	for(int i = a.length-1;i>=0;i--)
     {
	  for(int j = 1;j<=i;j++)
	    if(a[j]<a[j-1])
		 swap(a,j,j-1);
	 }
	}
	
/* ��������:
 * ���ʱ�䣺O(nlogn)  ƽ��ʱ�䣺O(nlogn)  �ʱ�䣺O(n^2)
 * �����洢��O(nlogn)  �ȶ��ԣ����ȶ�    ��ע��n��ʱ�Ϻ�
 * ���ڴ��͵ģ����������������������ٶ�
 * ���Ż�׼��ѡ��
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
/* ������:
 * ���ʱ�䣺O(nlogn)  ƽ��ʱ�䣺O(nlogn)  �ʱ�䣺O(nlogn)
 * �����洢��O(1)  �ȶ��ԣ����ȶ�    ��ע��n��ʱ�Ϻ�
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
   for(int i = a.length/2;i>=0;i--)    //������(��󶥶�) ��ǰһ���Ԫ��ʵ�����ˣ�ֵ��Ľڵ������ߣ� �м��ǵݼ�  
    heapadjust(a,i,a.length);          //��Ϊ����  ��Ҫ�ȿ����ӽڵ��ϵ һ���ڵ��Ӷ�Ϊ��󶥶�  ��ִ�����˲�����󶥶� 
   for(int i = a.length-1;i>=0;i--)
   {swap(a,0,i);                        //�Ӻ���ǰ��ÿ��Ԫ�غͶѶ�Ԫ�ػ��� ��������Ԫ��Ϊ���ֵ
    heapadjust(a,0,i-1 );                  //����i��Ԫ��ʵ��һ������
   }   
   }
   
   /* ϣ������:
    * ���ʱ�䣺O(n)  ƽ��ʱ�䣺O(nlogn)  �ʱ�䣺O(n^s(1<s<2))
    * �����洢��O(1)  �ȶ��ԣ����ȶ�    ��ע��s����ѡ����
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
    
    
 /*����������*/   
	public static void main(String[] args) {
	int[] a = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	insertsort(a);
	System.out.println("insertsort��" + Arrays.toString(a));
	int[] b = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	selectsort(b);
	System.out.println("selectsort��" + Arrays.toString(b));
	int[] c = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	bubblesort(c);
	System.out.println("bubblesort��" + Arrays.toString(c));
	int[] d = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	quicksort(d);
	System.out.println("quicksort��  " + Arrays.toString(d));
	int[] e = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	heapsort(e);
	System.out.println("heapsort��    " + Arrays.toString(e));
	int[] f = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,7,4};
	shellsort(f);
	System.out.println("shellsort��    " + Arrays.toString(f));
  }   
}
