package String;
//permutation �ַ���ȫ����
public class permutation {
	public static void swap(char a[],int i,int j){
	 char tmp = a[i];
	 a[i] = a[j];
     a[j] = tmp;
	}
	
	public static void perm(char s[],int start){
		
	  if(start==s.length-1 )     //&& s[1] != 'b'
	      System.out.println(s);       
	  else	  
        for(int i=start;i<=s.length-1;i++)
        {swap(s,start,i);                 
	     perm(s,start+1);
	     swap(s,start,i);     //��������겻�ָ�  ��for�Ͳ��ǰ�start�ͺ���ÿλ���н���
	    }    
	 }  
   public static void main(String[] args){
		String s = "abc";
	    perm(s.toCharArray(),0);
	}
}
	
