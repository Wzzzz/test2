package mianshi;

/*����Ϊn��������������0��n-1. ����ֻ�ܽ���0���������Ľ�����������º�����
ע����Ԫ��0ֻ����Ȣ��Ԫ�ؽ�����������λ��0.*/


public class huawei3 {
    /**
     * ����������n��0��λ��
     * 
     * @param array
     *            ����
     * @param len
     *            ���鳤��
     * @param n
     *            ��0��������
     */
    // ��Ҫ�޸����º�������
    public void swapWithZero(int[] array, int len, int n) {
  //  Main.SwapWithZero(array, len, n);  ���� �� ����ֵΪn��ֵΪ0����������λ��
    }
    // ��Ҫ�޸����Ϻ�������

    /**
     * ͨ������swapWithZero��������
     * 
     * @param array
     *            �洢��[0,n)������
     * @param len
     *            ���鳤��
     */
    public void sort(int[] array, int len) {
        // ����������
    swapWithZero(array,len,array[0]);    
    for(int i = 2; i<len ;i++)
	{ int tmp = array[i];  
	  for(int n = i;array[n-1]>=tmp && n>1;n--)
      { 
        int b = array[n-1] ; 
        swapWithZero(array,len,b); 
        swapWithZero(array,len,tmp);
        swapWithZero(array,len,b);
      }
    }
   }    
}