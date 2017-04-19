package mianshi;

public class meituan {
    public int[][] flipChess(int[][] A, int[][] f) {     
        for(int m = 0; m < f.length ;m++)
        {
        int i = f[m][0]-1;
        int p = f[m][1]-1;
        if(i+1<4)    
        A[i+1][p] = Math.abs(A[i+1][p]-1);
        if(p+1<4)    
        A[i][p+1] = Math.abs(A[i][p+1]-1);
        if(i-1>=0)    
        A[i-1][p] = Math.abs(A[i-1][p]-1);
        if(p-1>=0)    
        A[i][p-1] = Math.abs(A[i][p-1]-1);
        }
        return A;
        
    }
}