/*
  ������һ���������۾�����Ҫ�ӹ�˾������ȥ�ݷ����ڵ��̼ң���֪����λ���Լ��̼ҵ�λ�ã��������ڳ��е�·��ͨ��ԭ����ֻ����������ѡ��һ��������������ѡ��һ���������������ж����ַ��������̼ҵ�ַ��
����һ����ͼmap�����ĳ���n��m������1������λ�ã�2�����̼�λ�ã�-1�����ܾ����ĵ�����0������Ծ����ĵ������뷵�ط���������֤һ�����ںϷ�·������֤����ĳ���С�ڵ���10��
����������
[[0,1,0],[2,0,0]],2,3
���أ�2
*/

package mianshi;

public class meituan2 {
    public int countPath(int[][] map, int n, int m) {
        int manx = 0;
        int many = 0; 
        int wox = 0; 
        int woy = 0;     
       for(int i = 0;i < n;i++) 
       {for(int p = 0;p < m;p++)
        { if(map[i][p] == 1)
          {manx = i;
           many = p;}
          if(map[i][p] == 2) 
          {wox = i;
           woy = p;}
        }}
        
        int dx = -1;
        int dy = -1; 
        if(manx<wox)  
          dx = 1;  
        if(many<woy)  
          dy = 1;
       
       for(int i=manx+dx;i!=wox+dx;i=i+dx) 
       {
        if(map[i][many] == -1)
          map[i][many] = 0;
        else 
          map[i][many] = map[i-dx][many] ;      
         
       }
        
       for(int p=many+dy;p!=woy+dy;p=p+dy) 
       {
        if(map[manx][p] == -1)
          map[manx][p] = 0;
        else 
          map[manx][p] = map[manx][p-dy] ;      
       }
        
       for(int i=manx+dx;i!=wox+dx;i=i+dx) 
       {for(int p=many+dy;p!=woy+dy;p=p+dy)
         {if(map[i][p] == -1)
            map[i][p] = 0;
          else 
            map[i][p] = map[i-dx][p] + map[i][p-dy];      
         }
       }
       return map[wox][woy];
    }
}