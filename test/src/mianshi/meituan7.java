/*[编程题] 二维数组打印
有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
给定一个二位数组arr及题目中的参数n，请返回结果数组。
测试样例：
[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]],4
返回：[4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
对于一个由0..n的所有数按升序组成的序列，我们要进行一些筛选，每次我们取当前所有数字中从小到大的第奇数位个的数，并将其丢弃。重复这一过程直到最后剩下一个数。请求出最后剩下的数字。

输入描述:
每组数据一行一个数字，为题目中的n(n小于等于1000)。


输出描述:
一行输出最后剩下的数字。

输入例子:
500

输出例子:
255
*/
package mianshi;

public class meituan7 {
    public int[] arrayPrint(int[][] arr, int n) {
     int num = n*n;
     int res[] = new int[num];
     int a = 0;
     int b = n-1;
     int i = 0;
     res[i] = arr[a][b]; 
     int tmp = b-1;   
     while(b>-1){   
     if(b<n)  
     {res[i] = arr[a][b];i++;a++;b++;}
     else    
     {a = 0;b = tmp;tmp--;}  
     }  
     a = 1;
     b = 0;   
     tmp = a;   
     while(tmp<n){   
     if(a<n)  
     {res[i] = arr[a][b];i++;a++;b++;}
     else    
     {b = 0;a = tmp+1;tmp++;}       
     }  
     return res;  
    }
}