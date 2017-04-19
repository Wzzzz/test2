/*
[编程题] 奇数位丢弃
对于一个由0..n的所有数按升序组成的序列，我们要进行一些筛选，每次我们取当前所有数字中从小到大的第奇数位个的数，并将其丢弃。重复这一过程直到最后剩下一个数。请求出最后剩下的数字。

输入描述:
每组数据一行一个数字，为题目中的n(n小于等于1000)。


输出描述:
一行输出最后剩下的数字。

输入例子:
500

输出例子:
255
*/
package mianshi;

import java.util.*;

public class meituan6 {
    public static void main(String[] args)
    { Scanner s = new Scanner(System.in);
     while(s.hasNext())
     {
      int n = s.nextInt();
      List<Integer> list = new ArrayList<Integer>();   
      for(int i = 0;i<=n;i++)
      { list.add(i); } 
      while(list.size()>1){        
      for(int i = list.size()-1;i>=0;i--)
      {
          if(i%2 == 0)
          list.remove(i);             
      }
      } 
     System.out.println(list.get(0)); 
     }
    s.close();   
    }
}