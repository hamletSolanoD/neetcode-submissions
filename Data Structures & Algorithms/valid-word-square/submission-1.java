class Solution {
    public boolean validWordSquare(List<String> words) {
        int squareSize = words.size();
        for(int colums = 0; colums < squareSize; colums++){
            String currString = words.get(colums);
            for(int row = 0; row < currString.length(); row++){
                try{
                 char a  = currString.charAt(row);
                 char b = words.get(row).charAt(colums);
                 if(a != b) return false;
                }catch(Throwable e){return false;}
            }
        }
        return true;
    }
}
