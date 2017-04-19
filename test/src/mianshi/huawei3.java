package mianshi;

/*长度为n的数组乱序存放着0至n-1. 现在只能进行0与其他数的交换，完成以下函数。
注意是元素0只能与娶她元素交换，而不是位置0.*/


public class huawei3 {
    /**
     * 交换数组里n和0的位置
     * 
     * @param array
     *            数组
     * @param len
     *            数组长度
     * @param n
     *            和0交换的数
     */
    // 不要修改以下函数内容
    public void swapWithZero(int[] array, int len, int n) {
  //  Main.SwapWithZero(array, len, n);  函数 ： 交换值为n与值为0的两个数的位置
    }
    // 不要修改以上函数内容

    /**
     * 通过调用swapWithZero方法来排
     * 
     * @param array
     *            存储有[0,n)的数组
     * @param len
     *            数组长度
     */
    public void sort(int[] array, int len) {
        // 完成这个函数
    swapWithZero(array,len,array[0]);    
    for(int i = 2; i<len ;i++)
	{ int tmp = array[i];  
	  for(int n = i;array[n-1]>=tmp && n>1;n--)
      { 
        int b = array[n-1] ; 
        swapWithZero(array,len,b); 
        swapWithZero(array,len,tmp);
        swapWithZero(array,len,b);
      }
    }
   }    
}