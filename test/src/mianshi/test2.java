package mianshi;
import java.util.*;
public class test2 { 
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	 while(s.hasNext()){
     int a = s.nextInt();
     int b = s.nextInt();
     System.out.println(reverseAdd(a,b));    
    }
    s.close();   
    }
    public static int reverseAdd(int a,int b)    
    {
     int res = 0;    
     if(a>70000||a<1||b>70000||b<1)
     {res = -1;}    
     else{    
     int res1 = 0;    
     while(a!=0)    
     {   
     res1 = (res1*10)+(a%10);
     a = a/10;
     }
     int res2 = 0;    
     while(b!=0)    
     {   
     res2 = (res2*10)+(b%10); 
     b = b/10;     
     }
     res = res1+res2;
     }
     return res;  
    }    
  }