/*
已知某公司总人数为W，平均年龄为Y岁(每年3月末计算，同时每年3月初入职新人)，假设每年离职率为x，x>0&&x<1,每年保持所有员工总数不变进行招聘，新员工平均年龄21岁。 
从今年3月末开始，请实现一个算法，可以计算出第N年后公司员工的平均年龄。(最后结果向上取整)。 
输入描述:
输入W Y x N

输出描述:
输出第N年后的平均年龄

输入例子:
5 5 0.2 3

输出例子:
15
*/

package mianshi;

import java.util.*;

public class meituan5 {
    public static void main(String[] args)
    { Scanner s = new Scanner(System.in);
     while(s.hasNext())
     {
      double w = s.nextDouble();
      double y = s.nextDouble();  
      double x = s.nextDouble();
      double n = s.nextDouble();    
      for(int i = 0;i<n;i++)  
      {y = (w*x*21+(w-w*x)*(y+1))/w;}
     System.out.println((int)Math.ceil(y)); 
     }
    s.close();   
    }
}