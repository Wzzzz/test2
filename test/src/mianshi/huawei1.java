/*��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ���Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�. 
��������:
�����������������ݡ�
ÿ�������һ��������������N��M��0 < N <= 30000,0 < M < 5000��,�ֱ����ѧ������Ŀ�Ͳ�������Ŀ��ѧ��ID��Ŵ�1�ൽN��
�ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ�,��������M�У�ÿһ����һ���ַ�C��ֻȡ��Q����U������������������A,B,
��CΪ'Q'��ʱ��, ��ʾ����һ��ѯ�ʲ�������ѯ��ID��A��B������A,B����ѧ�����У��ɼ���ߵ��Ƕ���
��CΪ��U����ʱ�򣬱�ʾ����һ�����²�����Ҫ���IDΪA��ѧ���ĳɼ�����ΪB��

�������:
����ÿһ��ѯ�ʲ�������һ�����������߳ɼ�.

��������:
5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5
�������:
5
6
5
9
*/
package mianshi;

import java.util.*;

public class huawei1 {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
     while(s.hasNext()){   
     int n =  s.nextInt();
     int m =  s.nextInt();
     int start[] = new int[n];
     for(int i = 0;i<n;i++)
      start[i] = s.nextInt();    
     for(int q = 0;q<m;q++)
     {
      String sin = s.next();
      if(sin.equals("Q"))
      { int b = s.nextInt();
        int c = s.nextInt();
        if(b>c)
        {int p = b;
         b = c;
         c = p;}
    	for(int max=0,d=b-1;d<c;d++)
    	{max = Math.max(start[d], max);	
    	 if(d==c-1)
         System.out.println(max);
    	}
      }
      else if(sin.equals("U"))
       {int a = s.nextInt()-1;  
    	start[a] = s.nextInt();
       }  
     }
     }
     s.close();  
	}	 
  }

