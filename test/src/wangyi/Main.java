package wangyi;

import java.util.*;

public class Main {
      public static int Findmax(int[] a){
        int max = a[0];
        int index = 0;  
        for(int i = 0;i<a.length;i++) 
          if(a[i]>max){
           max = a[i];
           index = i;    
          }
         return index; 
      }
    
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		while(s.hasNext()){
        int n = s.nextInt();
        int start[]  = new int[n];
        int end[]  = new int[n];
        int dur[] = new int[n];   
        for(int i = 0;i<n;i++){    
           start[i] = s.nextInt(); 
           end[i] = s.nextInt();
           dur[i] = end[i]-start[i];
        }
        int res = 0;    
//        int taskdur[] = new int[end[Findmax(end)]+2];
        int taskstart[] = new int[n];
        int taskend[] = new int[n];    
        if(n == 0) 
        System.out.println(res);
        else{
//         for(int i = 0;i<n;i++){
//            if(taskdur[start[i]+1] != 1&&taskdur[end[i]-1]!= 1){
//            for(int j = start[i];j<end[i];j++)   
//               taskdur[j] = 1;
//            res++;    
//            } 
        taskstart[0] = start[0];    
        taskend[0] = end[0];
        res++;   
        for(int i = 1;i<n;i++){
           res++;
           for(int j = 0;j<n;j++){ 
            if(i!=j){ 
             if(start[i]<taskstart[j]&&end[i]>taskstart[j]){
              res--;
              break; 
             }
             if(start[i]>=taskstart[j]&&end[i]<=taskend[j]){
              res--;
              break; 
             }
             if(start[i]<taskend[j]&&end[i]>=taskend[j]){
              res--;
              break; 
             }   
           } 
        }   
        System.out.println(res);
        }    
		}   
		s.close();  
	}   	    
 }
}