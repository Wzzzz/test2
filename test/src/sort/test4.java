package sort;
import java.util.Arrays;
//merge sort 归并排序//
//复杂度稳定在O(NlogN)//

public class test4 {
	public static void merge(int a[],int start, int mid,int end)
	{
		int temp[] = new int[end-start +1];
		int k = 0,m = mid+1,i=start;
		while(i<=mid && m<=end)
		{
			if(a[i]<=a[m])
			temp[k++] = a[i++];
			else
		    temp[k++] = a[m++];	
		}
		while(i<=mid)
		    temp[k++] = a[i++];
		while(m<=end)
		    temp[k++] = a[m++];
		for(k=0;k<end-start+1;k++)
		  a[start+k] = temp[k];
	}
	
	public static void mergesort(int a[],int start,int end)
	{
		if(start<end)
		{
		int mid = (start+end)/2;
		mergesort(a,start,mid);
		mergesort(a,mid+1,end);
		merge(a,start,mid,end);
	    }	
	}
		
	public static void main(String[] args) {
	int[] a = {1,1,2,3,5,3,343,22,3,2,100,2,3,5,7,9,0,5,22,12,15,3,6};
	mergesort(a,0,a.length-1);
	System.out.println(Arrays.toString(a));
  }   
}
