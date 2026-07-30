class Solution {

    public int getSubGrid(int x,int y){
        if(y < 3){
            if (x < 3) return 1;
            if (x < 6) return 2;
            return 3;
        }
        if(y < 6)
        {
            if (x < 3) return 4;
            if (x < 6) return 5;
            return 6;
        }
        if (x < 3) return 7;
        if (x < 6) return 8;
        return 9;
    } 
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,List<Character>> columns = new HashMap<>();
        HashMap<Integer,List<Character>> rows = new HashMap<>();
        HashMap<Integer,List<Character>> subGrids = new HashMap();

        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board.length; y++){
                char currentValue = board[x][y];
                if(currentValue == '.') continue; 
                int subGrid = getSubGrid(x,y);
                columns.putIfAbsent(x,new ArrayList<Character>());
                rows.putIfAbsent(y,new ArrayList<Character>());
                subGrids.putIfAbsent(subGrid, new ArrayList<Character>());

                if(columns.get(x).contains(currentValue)) return false;
                if(rows.get(y).contains(currentValue)) return false;
                if(subGrids.get(subGrid).contains(currentValue)) return false;

                columns.get(x).add(currentValue);
                rows.get(y).add(currentValue);
                subGrids.get(subGrid).add(currentValue);
                
            }
        }
        return true;
    }
}
