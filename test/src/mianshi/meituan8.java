/*�ڹ��еĽ������У��������ɽ�����������(��������Ĵ�����С�ڵ���2)�������Ǳ���һ�ʳɽ��������һ��(����-��-��-����˳�����)������һ���еĹ�Ʊ�仯���У���дһ���������һ����Ի�õ�������档�����ʵ�����Ӷȵ͵ķ���ʵ�֡�
�����۸�����prices�����ĳ���n���뷵��������档��֤����С�ڵ���500��
����������
[10,22,5,75,65,80],6
���أ�87
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