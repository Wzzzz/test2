/*									
三子棋是一种大家熟知的游戏，几乎所有人都会玩。游戏规则相当简单，两人依次在一个3X3棋盘格上下棋，一个人画叉，另一个人画圈。任何一个人画的三个记号如果形成构成一条水平、垂直或对角的直线则获胜，游戏结束。画叉的人先开始游戏，如果所有的棋盘格都画满了但两人都不能获胜，则游戏平局结束。

游戏在一个3X3的棋盘上进行，每个棋盘格单元处于空白、画叉或画圈状态中的一种，你的任务是确定下一轮由谁下棋:
1：轮到先手下棋；
2：轮到后手下棋；

或者是判定游戏的状态：
x：给定的棋局不是合法的棋局；
1 won：先手获胜；
2 won：后手获胜；
Draw：平局；

小东对棋类游戏很有研究，这一次三子棋比赛中，她被邀请作为评判，为了提携后进，她请你帮忙判定。*/
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