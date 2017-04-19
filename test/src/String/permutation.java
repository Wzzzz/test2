package String;
//permutation 字符串全排列
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
	     swap(s,start,i);     //如果交换完不恢复  则for就不是把start和后面每位进行交换
	    }    
	 }  
   public static void main(String[] args){
		String s = "abc";
	    perm(s.toCharArray(),0);
	}
}
	
