//��÷������k k+1 k....


/*ʱ�����ƣ�C/C++���� 1000MS���������� 3000MS
�ڴ����ƣ�C/C++���� 65536KB���������� 589824KB
��Ŀ������
С���õ���n��ʯͷ���������Щʯͷ�ֳ����ɶѣ�ÿ��������һ��ʯͷ��������Щʯ������һ��ֱ���ϣ���ϣ�������������ѵ�ʯͷ������һ����С�����ĵ÷�Ϊʯͷ�����ڵ���k��ʯ��������������ܵö��ٷ֡�
�ϸ�أ�С����n��ʯͷ�ֳ���m�ѣ�ÿ�Ѹ�������Ϊa1��a2��.....��am��Ҫ�����㣺
1��ai��1��1��i��m��
2��ai��ai+1��1��i��m��
3��a1+a2+...+am��n
С����֪��a1��a2.....��am�д��ڵ���k����������ж��ٸ���
����
����������n, k����1��k��n��109��
���
������ĵ÷�

��������
5 1
�������
3

Hint
��������2
4 2
�������2
1
��������3
2 1
�������3
1

Hint
��һ�������У�һ�ֶַѷ���Ϊ��1 3 1
�ڶ��������У�һ�ֶַѷ���Ϊ��1 2 1
�����������У�ֻ�ֳܷ�һ�ѣ������2��ʯͷ*/
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