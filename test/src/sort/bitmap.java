package sort;

//位图法//
//字节位置 = 数据/32
//位位置=  1<<数据%32


public class bitmap {
   static int max = 16;
   public static void setBit(int[] arr, int n){
    arr[n/32] |= (1 << (n % 32));  // |表示按位或    有1则为1
   }
   public static void clearBit(int[] arr, int n){ 
	   arr[n/32] &= (~(1<<(n % 32)));   // &表示按位与   有0则为0  
   }
   public static int getBit(int[] arr, int n){
   return (arr[n/32] & (1 << (n%32))) != 0 ? 1 : 0;
   }
   public static void main(String[] args) { 
	 int[] datas = {1,14,15,7,8,9,13,2};
	 int[] arr = new int[max/32 + 1];
	 for(int i = 0 ; i<datas.length ; i++)
	     setBit(arr, datas[i]);
	 clearBit(arr,7);
	 for(int i = 0; i < max;i++){  //遍历
	   if(getBit(arr, i) == 1)
	    System.out.println(i);
	 }
	}
}