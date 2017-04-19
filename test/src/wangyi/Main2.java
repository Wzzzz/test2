package wangyi;
import java.util.*;

public class Main2 {    
   public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
     while(s.hasNext()){
     int n = s.nextInt();
     int a[] = new int[n-1];
     int Depth = 0;
     Set<Integer> set =  new HashSet<Integer>();    
     for(int i = 0;i<n-1;i++)       
      a[i] = s.nextInt();       
     for(int i = 0;i<n-1;i++){   
       if(set.add(i))   
         Depth++;  
     }     
      System.out.println(Depth);      
     }   
    s.close();  
	}   	    
}