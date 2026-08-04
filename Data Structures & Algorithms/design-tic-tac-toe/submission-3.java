class TicTacToe {

    int[] cols;
    int[] rows;
    int diagonal = 0;
    int antiDiagonal = 0;
    int total = 0;
    public TicTacToe(int n) {
        cols = new int[n];
        rows = new int[n];
        total = n;
    }
    
    public int move(int row, int col, int player) {
        cols[col] += player == 1? 1 : -1;
        rows[row] += player == 1? 1 : -1;
        if(row == col) diagonal += player == 1? 1 : -1;
        if(row == ( (total-col)-1)) antiDiagonal += player == 1? 1 : -1;

      

      for(int e = 0 ; e < total; e++){
        if(cols[e] == total) return 1;
        if(cols[e] == (total*-1)) return 2;
        if(rows[e] == total) return 1;
        if(rows[e] == (total*-1)) return 2;
      }
    if(diagonal == total) return 1;
    if(diagonal == (total*-1)) return 2;
    if(antiDiagonal == total) return 1;
    if(antiDiagonal == (total*-1)) return 2;
      return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
