package jingdong;

import java.util.*;
public class maimaiqingdan{
 public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   while(s.hasNext()){	   
   int n = s.nextInt();
   int m = s.nextInt();  
   Map<Integer,Integer> res1 = new TreeMap<Integer,Integer>();
   Map<Integer,Integer> res2 = new TreeMap<Integer,Integer>(new Comparator<Integer>(){  
    public int compare(Integer a,Integer b){return b-a;}  
    } );
   /*  
   * int compare(Object o1, Object o2) 返回一个基本类型的整型，  
   * 返回负数表示：o1 小于o2，  
   * 返回0 表示：o1和o2相等，  
   * 返回正数表示：o1大于o2。  
   */    
   String tmp;
   for(int i = 0; i<n ; i++) 
   { tmp = s.next();
	 if(tmp.equals("S"))
	 {int a = s.nextInt();
	  int b = s.nextInt();
      if(!res1.containsKey(a))
      res1.put(a,b); 
      else
      res1.put(a,res1.get(a)+b);   
	 }
     else if(tmp.equals("B"))
     {int a = s.nextInt();
      int b = s.nextInt();
      if(!res2.containsKey(a))
      res2.put(a,b); 
      else 
      res2.put(a,res2.get(a)+b);    
     }	                 
   }
   Iterator<Integer> iterator = res1.keySet().iterator();
   List<Integer> res = new LinkedList<Integer>();
   for(int i = 0;i<m;i++)
   { if(iterator.hasNext())
	  res.add(iterator.next());  
   }
   for(int i = res.size()-1;i>=0;i--)
   { 
	System.out.println("S"+" "+ res.get(i) +" "+ res1.get(res.get(i)));  
   }
   
   Iterator<Integer> iterator2 = res2.keySet().iterator();
   for(int i = 0;i<m;i++)
   {if(iterator2.hasNext()) 
     {int key = iterator2.next();
	  System.out.println("B"+" "+ key +" "+ res2.get(key));}    
   }
   }
    s.close();   
  }
 }