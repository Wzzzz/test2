/*									
��������һ�ִ����֪����Ϸ�����������˶����档��Ϸ�����൱�򵥣�����������һ��3X3���̸������壬һ���˻��棬��һ���˻�Ȧ���κ�һ���˻��������Ǻ�����γɹ���һ��ˮƽ����ֱ��Խǵ�ֱ�����ʤ����Ϸ��������������ȿ�ʼ��Ϸ��������е����̸񶼻����˵����˶����ܻ�ʤ������Ϸƽ�ֽ�����

��Ϸ��һ��3X3�������Ͻ��У�ÿ�����̸�Ԫ���ڿհס������Ȧ״̬�е�һ�֣����������ȷ����һ����˭����:
1���ֵ��������壻
2���ֵ��������壻

�������ж���Ϸ��״̬��
x����������ֲ��ǺϷ�����֣�
1 won�����ֻ�ʤ��
2 won�����ֻ�ʤ��
Draw��ƽ�֣�

С����������Ϸ�����о�����һ������������У�����������Ϊ���У�Ϊ����Я������������æ�ж���*/
package jingdong;

import java.util.*;
public class sanziqi{
 public static void main(String[] args)
  { Scanner s = new Scanner(System.in);
    while(s.hasNext()){
    char a[][] = new char[3][3];	
    String b = s.nextLine();
    a[0] = b.toCharArray();
    b = s.nextLine();
    a[1] = b.toCharArray();
    b = s.nextLine();
    a[2] = b.toCharArray();
    int m = 0;
    int n = 0;
    int q = 0;
    int res = 0;
    for(int i = 0;i<3;i++)
    { for(int j = 0;j<3;j++)	
       switch(a[i][j]){  
         case 'X':  m++;  break;  
         case '0':  n++;  break;
         case '.':  q++;  break;
    	   }
    }
    if(m-n>1||m<n)
      res = 1;
    else if(a[0][0]==a[0][1]&&a[0][1]==a[0][2]&&a[0][0]!='.')
      if(a[0][0] == 'X')
      res = 2;
      else res = 3;
    else if(a[1][0]==a[1][1]&&a[1][1]==a[1][2]&&a[1][0]!='.')
      if(a[1][0] == 'X')
      res = 4;
      else res = 5;
    else if(a[2][0]==a[2][1]&&a[2][1]==a[2][2]&&a[2][0]!='.')	
      if(a[2][0] == 'X')
      res = 6;
      else res = 7;
    else if(a[0][0]==a[1][0]&&a[1][0]==a[2][0]&&a[0][0]!='.')
      if(a[0][0] == 'X')
      res = 8;
      else res = 9;
    else if(a[0][1]==a[1][1]&&a[1][1]==a[2][1]&&a[0][1]!='.')
      if(a[0][1] == 'X')
      res = 10;
      else res = 11;	
    else if(a[0][2]==a[1][2]&&a[1][2]==a[2][2]&&a[0][2]!='.')	
      if(a[0][2] == 'X')
      res = 12;
      else res = 13;
    else if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]&&a[0][0]!='.')	
      if(a[0][0] == 'X')
      res = 14;
      else res = 15;
    else if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]&&a[0][2]!='.')	
      if(a[0][2] == 'X')
      res = 16;
      else res = 17;       	
    else if(q>0)
    {
     if(m>n)
      res = 18;
     else if(m<=n)
      res = 19;	
    }
    else if(q==0)
      res = 20;
    int tmp = res;
    if(res>1&&res<=17){
      if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]&&a[0][2]!='.') tmp = 16;	
      else if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]&&a[0][0]!='.') tmp = 14;
      else if(a[0][2]==a[1][2]&&a[1][2]==a[2][2]&&a[0][2]!='.') tmp = 12;
      else if(a[0][1]==a[1][1]&&a[1][1]==a[2][1]&&a[0][1]!='.') tmp = 10;
      else if(a[0][0]==a[1][0]&&a[1][0]==a[2][0]&&a[0][0]!='.') tmp = 8;
      else if(a[2][0]==a[2][1]&&a[2][1]==a[2][2]&&a[2][0]!='.') tmp = 6;	
      else if(a[1][0]==a[1][1]&&a[1][1]==a[1][2]&&a[1][0]!='.') tmp = 4;	
      else if(a[0][0]==a[0][1]&&a[0][1]==a[0][2]&&a[0][0]!='.')  tmp = 2; 	   
      if(res-tmp>1) 
      res = 1;
      else res = 2 + res - tmp;
      }
    switch(res){  
    case 1:  System.out.println("x");  break;  
    case 2:  System.out.println(1+" "+"won");  break;
    case 3:  System.out.println(2+" "+"won");  break;
    case 18:  System.out.println(2);  break;  
    case 19:  System.out.println(1);  break;
    case 20:  System.out.println("Draw");  break;    
	}
    }
    s.close();   
  }
 }