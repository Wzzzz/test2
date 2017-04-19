package xiecheng;

import java.util.*;

public class Main2 {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   while(s.hasNext()){
    int a[][] = new int[3][3];
     for(int i = 0;i<3;i++) {
       for(int j = 0;j<3;j++){
        a[i][j] = s.nextInt();   
       }}
     int b = 0;
     int c = 0;
     for(int i = 0;i<3;i++){ 
       for(int j = 0;j<3;j++){
         if(a[i][j] == 0){ 
         b=i;
         c=j;
         }
       }
     } 
     if(b == 2 && c==2)  
      System.out.println(0);
     else 
      System.out.println(1);   
   }
   s.close();   
 }
}
