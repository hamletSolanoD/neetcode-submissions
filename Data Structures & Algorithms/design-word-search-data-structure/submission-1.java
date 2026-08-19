class WordDictionary {

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode currentPointer = root;
        for(int e = 0; e < word.length(); e++){
            int charNodePosition = word.charAt(e) - 'a';
            if(currentPointer.dictionary[charNodePosition] == null){
               currentPointer.dictionary[charNodePosition] = new TrieNode();
            }
            currentPointer = currentPointer.dictionary[charNodePosition];
            if(e == word.length()-1){
                currentPointer.isFinalWord = true;
            }

        }
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }


    public boolean dfs(String word, int position, TrieNode localRoot){
        if(localRoot == null) return false;
        TrieNode currentPointer = localRoot;

        for(int e = position; e < word.length(); e++){
            int charNodePosition = word.charAt(e) - 'a';
            if(word.charAt(e) == '.'){
                for(char a = 'a'; a <= 'z'; a++ ){
                    if( dfs(word, e+1,currentPointer.dictionary[a-'a'] )){ return true;}
                    else{
                        continue;
                    }
                }
                return false;
            }
            else if(currentPointer.dictionary[charNodePosition] != null){
                    currentPointer = currentPointer.dictionary[charNodePosition];
            }
            else{
                return false;
            }
        }
             if( currentPointer.isFinalWord ){
                return true;
            }
        return false;

    }
}


public class TrieNode{
    public TrieNode dictionary[] = new TrieNode[26];
    public boolean isFinalWord;
}