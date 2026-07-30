class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

       int l1  = 0;
       int r1 = matrix.length-1;
       while(l1 <= r1){
            int row = l1 + ((r1-l1)/2);
            int l2 = 0;
            int r2 = matrix[row].length-1;
            if(target > matrix[row][r2]){
                l1 = row+1;
                continue;
            }
            else if(target < matrix[row][0]){
                r1 = row-1;
                continue;
            }

            while(l2 <= r2){
                int column = l2 + ((r2-l2)/2);
                int mid = matrix[row][column];
                if(mid < target){
                    l2 = column+1; 
                }
                else if(mid > target){
                    r2 = column-1;
                }
                else{
                  return true;

                }
            }
       return false;
       } 
        return false;
    }
}
