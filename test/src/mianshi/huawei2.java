/*开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。 
处理:
1.记录最多8条错误记录，对相同的错误记录(即文件名称和行号完全匹配)只记录一条，错误计数增加；(文件所在的目录不同，文件名和行号相同也要合并)
2.超过16个字符的文件名称，只记录文件的最后有效16个字符；(如果文件名不同，而只是文件名的后16个字符和行号相同，也不要合并)
3.输入的文件可能带路径，记录文件名称不能带路径

输入描述:
一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。

    文件路径为windows格式

    如：E:\V1R2\product\fpgadrive.c 1325

输出描述:
将所有的记录统计并将结果输出，格式：文件名代码行数数目，一个空格隔开，如: fpgadrive.c 1325 1 

    结果根据数目从多到少排序，数目相同的情况下，按照输入第一次出现顺序排序。

    如果超过8条记录，则只输出前8条记录.

    如果文件名的长度超过16个字符，则只输出后16个字符

输入例子:
E:\V1R2\product\fpgadrive.c 1325

输出例子:
fpgadrive.c 1325 1
*/
package mianshi;

import java.util.*;

public class huawei2 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    Map<String,Integer> map = new LinkedHashMap<String,Integer>(); // LinkedHashMap 保留插入顺序 当值大小一样的 按插入顺序排
    while(s.hasNext()){      //存数据到map中
	String a = s.next();
    int num = s.nextInt();
    int a1 = a.lastIndexOf('\\')+1;
    int a2 = a.length();  
    String b = a.substring(a1,a2)+" "+num;   
    if(!map.containsKey(b))
        map.put(b,1);     
    else 
        map.put(b,map.get(b)+1);   
    }
    int i = 0;
    /*按值大小排序
    Comparator 定义
    Comparator 接口仅仅只包括两个个函数，它的定义如下：
    
    package java.util;
    public interface Comparator<T> {
       int compare(T o1, T o2);
       boolean equals(Object obj);
    }
    说明：
    (01)若一个类要实现Comparator接口：它一定要实现compareTo(T o1, T o2) 函数，但可以不实现 equals(Object obj) 函数。
                   为什么可以不实现 equals(Object obj) 函数呢？ 因为任何类，默认都是已经实现了equals(Object obj)的。 
        Java中的一切类都是继承于java.lang.Object，在Object.java中实现了equals(Object obj)函数；所以，其它所有的类也相当于都实现了该函数。
    (02)int compare(T o1, T o2) 是“比较o1和o2的大小”。返回“负数”，意味着“o1比o2小”；返回“零”，意味着“o1等于o2”；返回“正数”，意味着“o1大于o2”。
                   如下：
     */
    List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());  
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
    return o2.getValue()-o1.getValue();
    }
    }); 
    //遍历map
    for(Map.Entry<String, Integer> entry : list)
    {i++;     
     String d;   
     if(entry.getKey().indexOf(' ')>16)
     {d = entry.getKey().substring(entry.getKey().indexOf(' ')-16,entry.getKey().indexOf(' '))+' '+
         entry.getKey().substring(entry.getKey().indexOf(' ')+1,entry.getKey().length());}
      else  
      {d = entry.getKey();}
     System.out.println(d +" "+entry.getValue());
     if(i>=8)
     break;  
    }
    s.close();
   }
  }