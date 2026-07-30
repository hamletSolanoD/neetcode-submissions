class Solution {
    public boolean validWordSquare(List<String> words) {
        for(int e = 0; e < words.size(); e++){
            String currentWord = words.get(e);
            for(int i = 0; i < currentWord.length(); i++ ){
                try{
                int charToProveRow = i;
                int charToProveColum = e;

                char currentChar = currentWord.charAt(i);
                String wordToProve = words.get(charToProveRow);
                char charToProve = wordToProve.charAt(charToProveColum);
                if(currentChar != charToProve) throw new Error();
                }catch(Throwable err){
                    return false;
                }
            }
        }
        return true;
    }
}
