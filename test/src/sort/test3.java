package sort;

import java.util.Arrays;
//heap sort ������//
/*
 ����ĳ��Ԫ��Ϊ���Ϊi(Java�����0��ʼ,iΪ0��n-1);
 �������������,��ô��������λ����2i+1,�����������,��������λ����2i+2 
����и��ڵ㣬���ڵ��λ����(n-1)/2ȡ��
��Ϊ���Ѻ���С�ѣ����ѵ������������ڵ㲻С�������ӽ�㣬��С�ѵĸ��ڵ㲻���������ӽ��
����N���������飬����N��insert(����)������O(N)    
�Լ�N��deleteMin(����) ÿ��O(logN) һ��O(NlogN) �������  
*/
public class test3 {
	public static void heapadjust(int a[],int i,int length)  
	{                                                      //ʵ������һ������� һ���ڵ������ ��Ľڵ������� ������ڵ�
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
     for(int i = a.length/2;i>=0;i--)  //������ʼ�� ��֤���нڵ���ӽڵ�֮���С��ϵ
		heapadjust(a,i,a.length);
     for(int i = a.length-1;i>0;i--)
     {	int tmp = a[i];                     //��֪��ʼ����a[0]������������ֵ
    	a[i] = a[0];
    	a[0] = tmp;
    	heapadjust(a,0,i);                  //��a[0]ȡ����a[i]λ��  �ҽ�a[0]��ʣ�µ�i-1�����������
     }                                      //���ÿ�ΰ�����ֵ�������  Ȼ���ǰ���������  �ָ�Ϊ��һ����ʼ��
	}
	public static void main(String[] args) {
	int[] aa = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6,2,3,4,6,0,5};
	heapsort(aa);
	System.out.println(Arrays.toString(aa));
  }   
}
