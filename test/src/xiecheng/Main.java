/*乘积最大
时间限制：C/C++语言 3MS；其他语言 2003MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
有一个整数n，将n分解成若干个不同自然数之和，问如何分解能使这些数的乘积最大，输出这个乘积m
输入
一个整数，不超过50
输出
一个整数

样例输入
15
样例输出
144
*/
package xiecheng;

import java.util.*;

public class Main {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   while(s.hasNext()){
   int n = s.nextInt();
   if(n<=4)
   System.out.println(n);
   else{ 
   int max = 1;
   int i = 2;
   while(i < n){
	max = max*i;
	n = n-i;
    i++;   
   }
   if(n != 0)    
   max = max/(i-1)*(n+i-1);    
   System.out.println(max); 
   }
   }
   s.close();   
 }
}