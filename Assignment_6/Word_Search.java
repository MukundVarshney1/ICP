class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0||i>=board.length||j>=board[0].length||word.charAt(idx)!=board[i][j]){
            return false;
        }    
        board[i][j]='1';
        boolean right=helper(board,word,i+1,j,idx+1);
        boolean left=helper(board,word,i,j+1,idx+1);
        boolean down=helper(board,word,i-1,j,idx+1);
        boolean up=helper(board,word,i,j-1,idx+1);
        board[i][j]=word.charAt(idx);
        return right || left || up || down;
    }
}