/*
��֪ĳ��˾������ΪW��ƽ������ΪY��(ÿ��3��ĩ���㣬ͬʱÿ��3�³���ְ����)������ÿ����ְ��Ϊx��x>0&&x<1,ÿ�걣������Ա���������������Ƹ����Ա��ƽ������21�ꡣ 
�ӽ���3��ĩ��ʼ����ʵ��һ���㷨�����Լ������N���˾Ա����ƽ�����䡣(���������ȡ��)�� 
��������:
����W Y x N

�������:
�����N����ƽ������

��������:
5 5 0.2 3

�������:
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