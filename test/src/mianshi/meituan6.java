/*
[�����] ����λ����
����һ����0..n����������������ɵ����У�����Ҫ����һЩɸѡ��ÿ������ȡ��ǰ���������д�С����ĵ�����λ�������������䶪�����ظ���һ����ֱ�����ʣ��һ��������������ʣ�µ����֡�

��������:
ÿ������һ��һ�����֣�Ϊ��Ŀ�е�n(nС�ڵ���1000)��


�������:
һ��������ʣ�µ����֡�

��������:
500

�������:
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