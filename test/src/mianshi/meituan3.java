/*
ֱ��ͼ��������
��һ��ֱ��ͼ����һ�����������ʾ������ÿ�еĿ��Ϊ1��������ֱ��ͼ��������������������磬����ֱ��ͼ[2,7,9,4],���������������ε����Ϊ14(��[7,9]������7x2�ľ���)��
����һ��ֱ��ͼA�������ܿ��n���뷵���������������ֱ֤��ͼ���С�ڵ���500����֤�����int��Χ�ڡ�
����������
[2,7,9,4,1],5
���أ�14
*/
package mianshi;

public class meituan3 {
  public int countArea(int[] A, int n) {
     int max = 0;
     int sum = 0;
     int a = 0;
     int b = 0;
     for(int i = 0;i<n;i++)   
     {
       for(int q = i; q<n ; q++ )   
       { if(A[i]>A[q])
          {a = q-1; break;}
         a = q;
       }
       for(int q = i; q>=0 ; q-- )   
       { if(A[i]>A[q])
          {b = q+1; break;}
         b = q; 
       }  
       sum = A[i]*(a-b+1);  
       max = Math.max(sum,max);   
     }            
    return max;   
    }
}