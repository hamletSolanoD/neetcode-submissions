class PrefixTree {
    TrieNode root = new TrieNode();
    public PrefixTree() {
    }

    public void insert(String word) {
       TrieNode currentNode = root;
       for(int e = 0; e < word.length();e++){
            int currentIndex = word.charAt(e) - 'a';
            if(currentNode.az[currentIndex] == null){
                currentNode.az[currentIndex] = new TrieNode();
            }
            currentNode = currentNode.az[currentIndex];
            if(e == word.length()-1){
                currentNode.isWord = true;
            }
       }
    }

    public boolean search(String word) {
      TrieNode currentNode = root;
       for(int e = 0; e < word.length();e++){
            int currentIndex = word.charAt(e) - 'a';
            if(currentNode.az[currentIndex] == null){
               return false;
            }
            currentNode = currentNode.az[currentIndex];
            if(e == word.length()-1 && currentNode.isWord ){
                return true;
            }
       }
       return false;
    }

    public boolean startsWith(String prefix) {
    TrieNode currentNode = root;
       for(int e = 0; e < prefix.length();e++){
            int currentIndex = prefix.charAt(e) - 'a';
            if(currentNode.az[currentIndex] == null){
               return false;
            }
            currentNode = currentNode.az[currentIndex];
            if(e == prefix.length()-1 && currentNode != null ){
                return true;
            }
       }
       return false;
    }
}

class TrieNode{
   public  TrieNode az[] = new TrieNode[26];
   public  boolean isWord;
}
