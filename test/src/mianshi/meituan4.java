/*
字符串计数
求字典序在s1和s2之间的，长度在len1到len2的字符串的个数，结果mod 1000007。

输入描述:
每组数据包涵s1（长度小于100），s2（长度小于100），len1（小于100000），len2（大于len1，小于100000）


输出描述:
输出答案。

输入例子:
ab ce 1 2

输出例子:
56
 */

package mianshi;

import java.util.*;

public class meituan4 {
  public static void main(String[] args) { 
      Scanner s = new Scanner(System.in);
     while(s.hasNext())
      {
      String s1 = s.next(); 
      String s2 = s.next();
      int len1 =  s.nextInt();   
      int len2 =  s.nextInt();
      Long res = 0L;
      int min;
      for(int i = len1;i<=len2;i++)
      {        
        Long vaulea = 0L;  
        min = Math.min(s1.length(),i);  
        for(int j = 0 ; j < min ; j++)  
        {vaulea = vaulea*26 + s1.charAt(j)-'a'+1; }     
        if(i>s1.length())
           {
            int temp=i-s1.length();
             while(temp-->0)
              vaulea*=26;
           }  
        Long vauleb = 0L;
        min = Math.min(s2.length(),i);    
        for(int j = 0 ; j < min ; j++)  
         { vauleb = vauleb*26 + s2.charAt(j)-'a'+1;}
        if(i>s2.length())
          {
           int temp=i-s2.length();
            while(temp-->0)
              vauleb*=26;
           }    
        res += vauleb - vaulea;   
      }
      res = res - 1;
      System.out.println(res%1000007);
     }    
    s.close();
  }
}