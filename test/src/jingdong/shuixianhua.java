/*��Ŀ������
�������ʻ��ļ��ڣ�ˮ�ɻ��������������˵Ĵ�����ѧ���и�ˮ�ɻ�����������������ģ�
��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3��
����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
����
���������ж��飬ÿ��ռһ�У�������������m��n��100<=m<=n<=999����
���
����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵�������ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
��������ķ�Χ�ڲ�����ˮ�ɻ����������no;
ÿ������ʵ�������ռһ�С�

��������
100 120
300 380
�������
no
370 371
*/
package jingdong;

import java.util.*;
public class shuixianhua{
  public static void main(String[] args)
  { Scanner s = new Scanner(System.in);
    while(s.hasNext()){
    int m = s.nextInt();
    int n = s.nextInt();
    int k = 0;
    for(int i = m;i<=n;i++) {
    if(i == Math.pow(i%10,3)+Math.pow(i/100,3)+Math.pow((i/10)%10,3)) 
    {System.out.print(i+" ");
     k = 1;}
    }
    if(k == 0)
    System.out.println("no");
    System.out.println("");
    }
    s.close();   
  }
}