class TicTacToe {
    int[][] tictactoe;
    int total = 0;
    public TicTacToe(int n) {
        tictactoe = new int[n][n];
        total = n;
    }
    
    public int move(int row, int col, int player) {
        tictactoe [row][col] = player;
        return verifyWin();
    }
    public int verifyWin(){
        //N possible solutions in Horizontal
        // N possible solutions on Vertical
        // 1 possible transversal 
        // 1 possible revers trransversal

        // horizontal solutions
        for(int horizontal = 0; horizontal< total; horizontal++){
            boolean allGood = false;
            int lastInUse = 0;
             for(int vertical = 0; vertical < total; vertical++){
                int number = tictactoe[horizontal][vertical];
                if(number == 0 ) {
                    allGood = false;
                    break;
                }
                if(lastInUse == number || lastInUse == 0){
                    allGood = true;
                }
                else{
                    allGood = false;
                    break;
                }
                lastInUse = number;
            }
            if(allGood){
                return lastInUse;
            }
        }
    
       // vertical solutions
        for(int horizontal = 0;horizontal < total; horizontal++){
            boolean allGood = false;
            int lastInUse = 0;
             for(int vertical = 0; vertical < total; vertical++){
                int number = tictactoe[vertical][horizontal];
                if(number == 0 ) {
                    allGood = false;
                    break;
                }
                if(lastInUse == number || lastInUse == 0){
                    allGood = true;
                }
                else{
                    allGood = false;
                    break;
                }
                lastInUse = number;
            }
            if(allGood){
                return lastInUse;
            }
        }


        boolean allGoodTransversal = false;
        int lastInUseTransversal = 0;
        for(int transversal = 0; transversal < total; transversal++){
            int number = tictactoe[transversal][transversal];
            if(number == 0 ) {
                allGoodTransversal = false;
                break;
            }
            if(lastInUseTransversal == number || lastInUseTransversal == 0){
                allGoodTransversal = true;
            }
            else{
                allGoodTransversal = false;
                break;
            }
            lastInUseTransversal = number;
        }
        if(allGoodTransversal)
        {
            return lastInUseTransversal;
        }
        lastInUseTransversal = 0;
        
       for(int transversal = 0; transversal < total; transversal++){
            int number = tictactoe[transversal][total-transversal-1];
            if(number == 0 ) {
                allGoodTransversal = false;
                break;
            }
            if(lastInUseTransversal == number || lastInUseTransversal == 0){
                allGoodTransversal = true;
            }
            else{
                allGoodTransversal = false;
                break;
            }
            lastInUseTransversal = number;
        }

        if(allGoodTransversal)
        {
            return lastInUseTransversal;
        }
        return 0;
    }

}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
