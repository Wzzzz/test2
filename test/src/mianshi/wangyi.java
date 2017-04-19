package mianshi;

import java.util.*;

public class wangyi {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  String text = s.nextLine();
  int num = 1;
  char a = text.charAt(0);
  StringBuilder ss = new StringBuilder(); 
  for(int i = 1;i<text.length();i++)
  {  
     if(a != text.charAt(i)) 
     {
      ss.append(num);
      ss.append(a);	 
      a = text.charAt(i);
      num = 1;
     }
     else 
      num++;  
  }
  ss.append(num);
  ss.append(text.charAt(text.length()-1));  
  String res = ss.toString();
  System.out.println(res);
  s.close();
  }
  }