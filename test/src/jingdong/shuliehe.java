/*��Ŀ������
���еĶ������£�
���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
����
���������ж��飬ÿ��ռһ�У�����������n��n<10000����m(m<1000)��ɣ�n��m�ĺ�����ǰ������
���
����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС����

��������
81 4
2 2
�������
94.73
3.41
*/

package jingdong;

import java.util.*;
public class shuliehe{
 public static void main(String[] args)
  { Scanner s = new Scanner(System.in);
    while(s.hasNext()){
    int n = s.nextInt();
    int m = s.nextInt();
    double a = (double)n ;    
    double sum = 0;    
    for(int i = 0 ; i<m ; i++)
    {sum = sum + a;
     a = Math.sqrt(a);   
    }
    String ss = String.format("%.2f",sum);    
    System.out.println(ss);         
    }
    s.close();   
  }
 }