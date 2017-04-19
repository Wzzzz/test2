package wangyi;

import java.util.*;

public class test1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	while(s.hasNext()){
	  int n = s.nextInt();  
	  int sum = 0;  
	  int arr[] = new int[n];  
	  for (int i = 0; i < n; i++) {  
	      arr[i] = s.nextInt();  
	      arr[i] /= 1024;  
	      sum += arr[i];  
	   }  
	  int[][] dp = new int[n + 1][sum / 2 + 1];  
	     
	  for (int i = 0; i < n; i++)  
	     for (int j = 1; j <= sum / 2; j++) {         
	       if (arr[i] <= j && dp[i][j - arr[i]] + arr[i] > dp[i][j])   
	         dp[i + 1][j] = dp[i][j - arr[i]] + arr[i];
	       else
	    	 dp[i + 1][j] = dp[i][j];  
	     }  
	  System.out.println((sum - dp[n][sum / 2]) * 1024);  
	}   
	s.close();  
  }   	    
}
