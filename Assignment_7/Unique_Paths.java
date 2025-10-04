class Solution {
    public int uniquePaths(int m, int n) {
        int[][] t=new int[m][n];
        for(int[] row:t){
            Arrays.fill(row,-1);
        }
        return Count(m,n,0,0,t);
    }
    public static int Count(int m,int n,int d,int r,int[][] t){
        if(d==m-1 && r==n-1){
            return 1;
        }
        if(d>=m || r>=n){
            return 0;
        }
        if(t[d][r]!=-1){
            return t[d][r];
        }
        int a=Count(m,n,d+1,r,t);
        int b=Count(m,n,d,r+1,t);
        return t[d][r]=a+b;
    }
}