/*����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš� 
����:
1.��¼���8�������¼������ͬ�Ĵ����¼(���ļ����ƺ��к���ȫƥ��)ֻ��¼һ��������������ӣ�(�ļ����ڵ�Ŀ¼��ͬ���ļ������к���ͬҲҪ�ϲ�)
2.����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���(����ļ�����ͬ����ֻ���ļ����ĺ�16���ַ����к���ͬ��Ҳ��Ҫ�ϲ�)
3.������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·��

��������:
һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������

    �ļ�·��Ϊwindows��ʽ

    �磺E:\V1R2\product\fpgadrive.c 1325

�������:
�����еļ�¼ͳ�Ʋ�������������ʽ���ļ�������������Ŀ��һ���ո��������: fpgadrive.c 1325 1 

    ���������Ŀ�Ӷൽ��������Ŀ��ͬ������£����������һ�γ���˳������

    �������8����¼����ֻ���ǰ8����¼.

    ����ļ����ĳ��ȳ���16���ַ�����ֻ�����16���ַ�

��������:
E:\V1R2\product\fpgadrive.c 1325

�������:
fpgadrive.c 1325 1
*/
package mianshi;

import java.util.*;

public class huawei2 {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    Map<String,Integer> map = new LinkedHashMap<String,Integer>(); // LinkedHashMap ��������˳�� ��ֵ��Сһ���� ������˳����
    while(s.hasNext()){      //�����ݵ�map��
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
    /*��ֵ��С����
    Comparator ����
    Comparator �ӿڽ���ֻ�������������������Ķ������£�
    
    package java.util;
    public interface Comparator<T> {
       int compare(T o1, T o2);
       boolean equals(Object obj);
    }
    ˵����
    (01)��һ����Ҫʵ��Comparator�ӿڣ���һ��Ҫʵ��compareTo(T o1, T o2) �����������Բ�ʵ�� equals(Object obj) ������
                   Ϊʲô���Բ�ʵ�� equals(Object obj) �����أ� ��Ϊ�κ��࣬Ĭ�϶����Ѿ�ʵ����equals(Object obj)�ġ� 
        Java�е�һ���඼�Ǽ̳���java.lang.Object����Object.java��ʵ����equals(Object obj)���������ԣ��������е���Ҳ�൱�ڶ�ʵ���˸ú�����
    (02)int compare(T o1, T o2) �ǡ��Ƚ�o1��o2�Ĵ�С�������ء�����������ζ�š�o1��o2С�������ء��㡱����ζ�š�o1����o2�������ء�����������ζ�š�o1����o2����
                   ���£�
     */
    List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());  
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
    return o2.getValue()-o1.getValue();
    }
    }); 
    //����map
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