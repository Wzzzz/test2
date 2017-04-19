package biaodashi;
/*前缀表达式（前缀记法、波兰式）
前缀表达式的运算符位于操作数之前。

前缀表达式的计算机求值：
从右至左扫描表达式，遇到数字时，将数字压入堆栈，遇到运算符时，弹出栈顶的两个数，
用运算符对它们做相应的计算（栈顶元素和 次顶元素），并将结果入栈；重复上述过程直到表达式最左端，最后运算得出的值即为表达式的结果。
*/

/*中缀表达式转为前缀表达式
(1) 初始化两个栈：运算符栈S1和储存中间结果的栈S2；
(2) 从右至左扫描中缀表达式；遇到数时，将其压入S2；

(3) 遇到运算符时，比较其与S1栈顶运算符的优先级：
(3-1) 如果S1为空，或栈顶运算符为右括号“)”，或优先级比栈顶运算符的较高或相等  则直接将此运算符入栈；
(3-2) 否则，将S1栈顶的运算符弹出并压入到S2中，再次转到(3-1)与S1中新的栈顶运算符相比较；

(4) 遇到括号时：
(4-1) 如果是右括号“)”，则直接压入S1；
(4-2) 如果是左括号“(”，则依次弹出S1栈顶的运算符，并压入S2，直到遇到右括号为止，此时将这一对括号丢弃；

(5) 重复步骤(3)至(4)，直到表达式的最左边；
(6) 将S1中剩余的运算符依次弹出并压入S2；
(7) 依次弹出S2中的元素并输出，结果即为中缀表达式对应的前缀表达式。*/

import java.util.*;
 public class qianzhui{
	 String midToPre(String Seq){  
		    Stack<Character> S1 = new Stack<Character>();    //S1用来存放临时运算符  
		    Stack<Character> S2 = new Stack<Character>();   //S2用来存放最后结果  
		      
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
 
 /*类似的后缀是从左到右读数
 中缀转后缀 也是从左到右 且原来对“)”的条件转为“(”
 */