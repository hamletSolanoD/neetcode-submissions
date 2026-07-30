class Solution {

    public class IndexHeight {
        int index = 0;
        int heigth = 0;
        public IndexHeight(int in, int hei){
            this.index = in;
            this.heigth = hei;
        }
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<IndexHeight> stack = new Stack<>();
        for(int e = 0; e < heights.length; e++){
            int start = e;
            IndexHeight current = new IndexHeight(e,heights[e]);
            while(!stack.isEmpty() && stack.peek().heigth > current.heigth){
               IndexHeight last = stack.pop();
               maxArea = Math.max(maxArea, last.heigth * (e-last.index));
               start = last.index;
            }
            current.index = start;
            stack.push(current);
        }


        for(IndexHeight c : stack){
            maxArea = Math.max(maxArea,c.heigth * (heights.length-c.index));
        }
        return maxArea;
    }
}
