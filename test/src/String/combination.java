package String;


//permutation �ַ���ȫ���
public class combination {
   public  static void combine(String s) {
     StringBuffer result = new StringBuffer();
     for (int m = 1; m <= s.length(); m++) 
       combine(s,0,m,result);                  //char�� n���ַ���   ��m������� m��i��1-char.length
    }
   public static void combine(String s,int begin,int m, StringBuffer result) {  
        if(m == 0){
         System.out.println(result);
         return;
        } 
        if(begin == s.length()) return;        
        result.append(s.charAt(begin));
        combine(s,begin+1,m-1,result);
        result.deleteCharAt(result.length()-1);
        combine(s,begin+1,m,result);
    }
   public static void main(String[] args){
		String s = "abcd";
		combine(s);
	}
}
	
