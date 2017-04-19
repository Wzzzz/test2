package sort;

//两个排序数组找合并起来的第k个值
//思路 当k小于两数组中位之和   丢弃掉两数组中位数大的那部分后面的数（为k后面的值）
//当k大于两数组中位之和   取两数组中位数小的那部分前面的数（为k的前面值） 更新k值并舍弃
//当一个数组开始位置结束位置一致  说明这个数组已经被舍弃   则第k个值在另一个数组的第k个位置


public class twosortfindN {
     public static int find(int a[],int start1,int end1,int b[],int start2,int end2,int k){
		int mid1 = (start1+end1)/2;
		int mid2 = (start2+end2)/2;
    	if(start1>end1)   return b[start2+k-1];
    	if(start2>end2)   return a[start1+k-1];
	
    	if(k<=mid1-start1+mid2-start2+1){
    	   if(a[mid1]<=b[mid2])   
     	      return find(a,start1,end1,b,start2,mid2-1,k);
     	   else return find(a,start1,mid1-1,b,start2,end2,k);
     	 }
    	if(k>mid1-start1+mid2-start2+1){
     	   if(a[mid1]<=b[mid2]) 
     		  return find(a,mid1+1,end1,b,start2,end2,k-(mid1-start1)-1);
      	   else return find(a,start1,end1,b,mid2+1,end2,k-(mid2-start2)-1);
      	 }	
		return -1;
    	}		  
     public static void main(String[] args){
    	 
    	int a[] = {1,3,5,6,7,18,25}; 
    	int b[] = {2,4,9,11,15,17};
    	for(int k = 1;k<11;k++)
    	System.out.println(find(a,0,a.length-1,b,0,b.length-1,k));
    	 
     }  			  
    			  
    			  
    	 
    	 
     }
