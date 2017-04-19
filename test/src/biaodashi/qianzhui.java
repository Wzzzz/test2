package biaodashi;
/*ǰ׺���ʽ��ǰ׺�Ƿ�������ʽ��
ǰ׺���ʽ�������λ�ڲ�����֮ǰ��

ǰ׺���ʽ�ļ������ֵ��
��������ɨ����ʽ����������ʱ��������ѹ���ջ�����������ʱ������ջ������������
�����������������Ӧ�ļ��㣨ջ��Ԫ�غ� �ζ�Ԫ�أ������������ջ���ظ���������ֱ�����ʽ����ˣ��������ó���ֵ��Ϊ���ʽ�Ľ����
*/

/*��׺���ʽתΪǰ׺���ʽ
(1) ��ʼ������ջ�������ջS1�ʹ����м�����ջS2��
(2) ��������ɨ����׺���ʽ��������ʱ������ѹ��S2��

(3) ���������ʱ���Ƚ�����S1ջ������������ȼ���
(3-1) ���S1Ϊ�գ���ջ�������Ϊ�����š�)���������ȼ���ջ��������Ľϸ߻����  ��ֱ�ӽ����������ջ��
(3-2) ���򣬽�S1ջ���������������ѹ�뵽S2�У��ٴ�ת��(3-1)��S1���µ�ջ���������Ƚϣ�

(4) ��������ʱ��
(4-1) ����������š�)������ֱ��ѹ��S1��
(4-2) ����������š�(���������ε���S1ջ�������������ѹ��S2��ֱ������������Ϊֹ����ʱ����һ�����Ŷ�����

(5) �ظ�����(3)��(4)��ֱ�����ʽ������ߣ�
(6) ��S1��ʣ�����������ε�����ѹ��S2��
(7) ���ε���S2�е�Ԫ�ز�����������Ϊ��׺���ʽ��Ӧ��ǰ׺���ʽ��*/

import java.util.*;
 public class qianzhui{
	 String midToPre(String Seq){  
		    Stack<Character> S1 = new Stack<Character>();    //S1���������ʱ�����  
		    Stack<Character> S2 = new Stack<Character>();   //S2������������  
		      
		    int len = Seq.length();  
		    int index = len - 1;  
		    while(index >= 0){  
		        char c = Seq.charAt(index);  
		        switch(c){  
		        case ')': S1.push(c);  
		                  break;  
		        case '(': while(S1.peek() != ')'){  
		                  S2.push(S1.pop());  
		                  }  
		                  S1.pop();  
		                  break;  
		        case '*':  
		        case '/': S1.push(c);  
		                  break;  
		        case '+':  
		        case '-':  
		                  if(S1.empty() || S1.peek().toString().matches("[+-]"))  
		                  S1.push(c);  
		                  else{  
		                  while(!S1.empty() && S1.peek().toString().matches("[*/]")){  
		                  S2.push(S1.pop());  
		                  }  
		                  S1.push(c);  
		                  }  
		                  break;  
		        default:  
		                  S2.push(c);  
		        }  
		        index--;  
		    }  
		    while(!S1.empty())  
		        S2.push(S1.pop());  
		    StringBuffer preSeq = new StringBuffer();  
		    Iterator<Character> iter = S2.iterator();  
		    while(iter.hasNext())  
		        preSeq.append(iter.next());  
		    preSeq = preSeq.reverse();  
		    return preSeq.toString();  
		}  
	 }
 
 /*���Ƶĺ�׺�Ǵ����Ҷ���
 ��׺ת��׺ Ҳ�Ǵ����� ��ԭ���ԡ�)��������תΪ��(��
 */