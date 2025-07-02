class Solution {
    public static boolean ISafe(char[][] board ,int row, int col,int k){
        char x = (char) (k + '0');
        for(int i =0;i<9;i++){
            //for row check
            if(board[row][i]== x){
                return false;
            }
            //for col check
             if(board[i][col]== x){
                return false;
            }
            //for 3x3 grid checking
            int subgridrow=3*(row/3) + (i/3);
            int subgridcol=3*(col/3) + (i%3);
             if(board[subgridrow][subgridcol]== x){
              return false;
            }
        }
        return true;
    }
    public static boolean fillingNumbers(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(int k=1;k<=9;k++){
                        if(ISafe(board,i,j,k)){
                           
                            board[i][j]= (char) (k + '0');
                            if(fillingNumbers(board)){
                                 
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        fillingNumbers(board);
    }
}