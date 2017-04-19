/*在股市的交易日中，假设最多可进行两次买卖(即买和卖的次数均小于等于2)，规则是必须一笔成交后进行另一笔(即买-卖-买-卖的顺序进行)。给出一天中的股票变化序列，请写一个程序计算一天可以获得的最大收益。请采用实践复杂度低的方法实现。
给定价格序列prices及它的长度n，请返回最大收益。保证长度小于等于500。
测试样例：
[10,22,5,75,65,80],6
返回：87
*/
package mianshi;

public class meituan8 {
        public static int maxProfit(int[] prices, int n) {    
        int[] preProfit = new int[n];  
        int[] postProfit = new int[n];   
        int max = Integer.MIN_VALUE;  
        int min = prices[0];  
        for(int i = 1;i<n;i++){  
           min = Math.min(min, prices[i]);  
           preProfit[i] = Math.max(preProfit[i-1], prices[i] - min);  
        }  
        int max2 = prices[n-1];  
        for(int i = n-2;i>=0;i--){  
           max2 = Math.max(max2, prices[i]);  
           postProfit[i] = Math.max(postProfit[i+1],max2-prices[i]);  
        }  
        for(int i = 0;i<n;i++){  
           max = Math.max(preProfit[i] + postProfit[i], max);  
        }  
        return max;  
    }  
}