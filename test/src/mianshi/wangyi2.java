/*
��һ��N*N��������Ѱ�����кᣬ�������ϵ����£����ϵ����£����ַ����ֱ������D�����ֵĺ���������ֵ 
��������:
ÿ�������������1��������������һ�а����������� N �� D :
3 <= N <= 100
1 <= D <= N
��������N�У�ÿ��N������d:
0 <= d <= 100


�������:
���һ����������ʾ�ҵ��ĺ͵����ֵ

��������:
4 2
87 98 79 61
10 27 95 70
20 64 73 29
71 65 15 0

�������:
193
*/
package mianshi;

import java.util.*;

public class wangyi2{
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
     int d = s.nextInt();
     int max = Integer.MIN_VALUE;
     int sum = 0;
     int q = 0;
     int t[][]= new int[n][n];   
     for(int i = 0;i<n;i++)   
     { 
      for(int p = 0;p<n;p++)
       t[i][p] = s.nextInt(); 
     }     
     for(int i = 0;i<n;i++)   
     { 
      for(int p = 0;p<n;p++)
      {
       sum = 0;
       for(q = 0 ;(q<d)&&(p+q<n); q++)
         sum = sum + t[i][p+q]; 
       if(q == d)                    //�����ص�ע�⣡����  ������d����������  ������d��������  �ҷ����˵�sum���ܽ���Ϊmax
        max = Math.max(max,sum);
       sum = 0;   
       for(q = 0 ; (q<d)&&(i+q<n); q++)   
         sum = sum + t[i+q][p];
       if(q == d)      
       max = Math.max(max,sum);
       sum = 0;   
       for(q = 0 ; (q<d)&&(i+q<n)&&(p+q<n); q++)
         sum = sum + t[i+q][p+q];
       if(q == d)   
       max = Math.max(max,sum);
       sum = 0;   
       for(q = 0 ; (q<d)&&(i+q<n)&&(p-q>=0); q++)
         sum = sum + t[i+q][p-q];
       if(q == d)   
       max = Math.max(max,sum); 
      } 
     }          
      System.out.println(max);  
      s.close(); 
	 }	 
}  


