class Solution {
  static  ArrayList<List<String>> result=new ArrayList<>();
  static  boolean isSafe(char[][] board, int row, int col, int n) {
    // Check left row
    for (int i = 0; i < col; i++) {
        if (board[row][i] == 'Q') return false;
    }

    // Check upper-left diagonal
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // Check lower-left diagonal
    for (int i = row, j = col; i < n && j >= 0; i++, j--) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
}

    public List<List<String>> solveNQueens(int n) {
        result.clear();
        char[][] board = new char[n][n];
        for(char[] num:board){
            Arrays.fill(num,'.');
        }
        Allpaths(0, board, n);
        return result;
    }

    static void Allpaths(int col,char[][] board,int n){
        if(col==n){
            ArrayList<String> str =new ArrayList<>();
            for(int row=0;row<n;row++){
                StringBuilder sb=new StringBuilder("");
                for(int c=0;c<n;c++){
                    if(board[row][c]=='Q'){
                        sb.append('Q');
                    }
                    else{
                        sb.append('.');
                    }
                }
                str.add(sb.toString());
            }
            result.add(str);
            return;
        }

        for(int row =0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col] ='Q';
                Allpaths(col+1,board,n);
                board[row][col]='.';
            }

        }

        return;

    }
}