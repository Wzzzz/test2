//最好分配就是k k+1 k....


/*时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
小明得到了n个石头，他想把这些石头分成若干堆，每堆至少有一个石头。他把这些石堆排在一条直线上，他希望任意相邻两堆的石头数都不一样。小明最后的得分为石头数大于等于k的石堆数，问他最多能得多少分。
严格地，小明把n个石头分成了m堆，每堆个数依次为a1，a2，.....，am。要求满足：
1、ai≥1（1≤i≤m）
2、ai≠ai+1（1≤i＜m）
3、a1+a2+...+am＝n
小明想知道a1，a2.....，am中大于等于k的数最多能有多少个？
输入
输入两个数n, k。（1≤k≤n≤109）
输出
输出最大的得分

样例输入
5 1
样例输出
3

Hint
输入样例2
4 2
输出样例2
1
输入样例3
2 1
输出样例3
1

Hint
第一个样例中，一种分堆方法为：1 3 1
第二个样例中，一种分堆方法为：1 2 1
第三个样例中，只能分成一堆，这堆有2个石头*/
package jingdong;
import java.util.*;
public class Main {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   while(s.hasNext()){
   int a = s.nextInt();
   int b = s.nextInt();
   int res = a/(2*b+1);
   int re = a%(2*b+1);
   if(re>=b)
    res++;
   System.out.println(res);
   }  
   s.close();   
}
}