class Solution {

    public int rows = 0;
    public int cols = 0;
    public int numIslands(char[][] grid) {
        cols = grid.length-1;
        rows = grid[0].length-1;

        int islands = 0;
        for(int x = 0; x <= cols; x++){
            for(int y = 0; y <= rows; y++){
                if(grid[x][y] == '1'){
                    dfs(grid, x, y);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(char[][] grid, int x, int y){
        if(y > rows || x > cols || y < 0 || x < 0) return;
        if(grid[x][y] == '1') {
            grid[x][y] = '0';
            dfs(grid, x+1,y);
            dfs(grid, x-1,y);
            dfs(grid, x,y+1);
            dfs(grid, x,y-1);
        } 
    }


}
