/*�˻����
ʱ�����ƣ�C/C++���� 3MS���������� 2003MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
��һ������n����n�ֽ�����ɸ���ͬ��Ȼ��֮�ͣ�����ηֽ���ʹ��Щ���ĳ˻�����������˻�m
����
һ��������������50
���
һ������

��������
15
�������
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