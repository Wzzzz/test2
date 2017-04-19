package sort;

import java.util.Arrays;
//insert sort≤Â»Î≈≈–Ú//
public class test {
	public static void main(String[] args) {
	int[] aa = {1,1,2,3,5,3,343,22,3,2,5,22,12,15,3,6};
	int n;
	for(int i = 1; i<aa.length ;i++)
	{   
	  int tmp = aa[i]; 
	  for(n = i;aa[n-1]>=tmp && n>1;n--)
	     aa[n] = aa[n-1];
	  aa[n] = tmp;
	}
	System.out.println(Arrays.toString(aa));
  }   
}
