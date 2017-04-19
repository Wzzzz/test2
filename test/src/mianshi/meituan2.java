/*
  现在有一个城市销售经理，需要从公司出发，去拜访市内的商家，已知他的位置以及商家的位置，但是由于城市道路交通的原因，他只能在左右中选择一个方向，在上下中选择一个方向，现在问他有多少种方案到达商家地址。
给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家位置，-1代表不能经过的地区，0代表可以经过的地区，请返回方案数，保证一定存在合法路径。保证矩阵的长宽都小于等于10。
测试样例：
[[0,1,0],[2,0,0]],2,3
返回：2
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