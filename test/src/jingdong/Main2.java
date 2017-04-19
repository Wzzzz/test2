/* 异或   输入两个相同位数的二进制数据  其这两个二进制的数据的异或  并 求其十进制
 * 输入 n 1010.. 1010..
 * 例如 4 1111 0000
 * */

package jingdong;
import java.util.*;
public class Main2 {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   while(s.hasNext()){
   int n = s.nextInt(); 
   String a = s.next();   
   String b = s.next();
   int[] res = new int[n];
   for(int i = 0;i<n;i++)
   {if(a.charAt(i)==b.charAt(i))
    res[i]=0; 
    else  res[i]=1;
   }
   double result = 0;
   for(int i = 0;i<n;i++)
   {
	 if(res[i] == 1)
	 result += res[i]*Math.pow(2,n-i-1);
   }
   System.out.println((int)result); 
   }
   s.close();   
}
}
