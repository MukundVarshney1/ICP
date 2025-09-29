class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minc=0;
        int minr=0;
        int maxc=matrix[0].length-1;
        int maxr=matrix.length-1;
        List<Integer> ans=new ArrayList<>();
        int c=0;
        while(c<matrix.length*matrix[0].length){
        for(int i=minc;i<=maxc&&c<matrix.length*matrix[0].length;i++){
            ans.add(matrix[minr][i]);
            c++;
        }
        minr++;
        for(int i=minr;i<=maxr&&c<matrix.length*matrix[0].length;i++){
            ans.add(matrix[i][maxc]);
            c++;
        }
        maxc--;
        for(int i=maxc;i>=minc&&c<matrix.length*matrix[0].length;i--){
            ans.add(matrix[maxr][i]);
            c++;
        }
        maxr--;
        for(int i=maxr;i>=minr&&c<matrix.length*matrix[0].length;i--){
            ans.add(matrix[i][minc]);
            c++;
        }
        minc++;

    }
    return ans;
    }
}