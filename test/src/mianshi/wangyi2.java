/*
在一个N*N的数组中寻找所有横，竖，左上到右下，右上到左下，四种方向的直线连续D个数字的和里面最大的值 
输入描述:
每个测试输入包含1个测试用例，第一行包括两个整数 N 和 D :
3 <= N <= 100
1 <= D <= N
接下来有N行，每行N个数字d:
0 <= d <= 100


输出描述:
输出一个整数，表示找到的和的最大值

输入例子:
4 2
87 98 79 61
10 27 95 70
20 64 73 29
71 65 15 0

输出例子:
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
       if(q == d)                    //这里重点注意！！！  必须是d个连续的数  当不是d个连续的  且返回了的sum不能接收为max
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


