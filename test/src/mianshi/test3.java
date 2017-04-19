package mianshi;
import java.util.*;
public class test3 { 
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
	 while(s.hasNext()){
     String a = s.next();
     int res[] = {1,2,3,4,5,6};    
     for(int i = 0;i<a.length();i++)
     {
       if(a.charAt(i)=='L')
        {int tmp = res[0];  
         res[0] = res[4];   
         res[4] = res[1];  
         res[1] = res[5];
         res[5] = tmp;}
       if(a.charAt(i)=='R')
        {int tmp = res[0];  
         res[0] = res[5];   
         res[5] = res[1];  
         res[1] = res[4];
         res[4] = tmp;}
       if(a.charAt(i)=='F')
        {int tmp = res[2];  
         res[2] = res[4];   
         res[4] = res[3];  
         res[3] = res[5];
         res[5] = tmp;}  
       if(a.charAt(i)=='B')
        {int tmp = res[2];  
         res[2] = res[5];   
         res[5] = res[3];  
         res[3] = res[4];
         res[4] = tmp;}    
       if(a.charAt(i)=='A')
        {int tmp = res[0];  
         res[0] = res[3];   
         res[3] = res[1];  
         res[1] = res[2];
         res[2] = tmp;}   
       if(a.charAt(i)=='C')
        {int tmp = res[0];  
         res[0] = res[2];   
         res[2] = res[1];  
         res[1] = res[3];
         res[3] = tmp;}  
     }      
     System.out.println(res);    
     }
     s.close();   
    }     
  }
