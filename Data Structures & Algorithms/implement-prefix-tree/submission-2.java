class PrefixTree {
    LinkedHashSet<String> prefixWords = new LinkedHashSet<String>();
    LinkedHashSet<String> completeWords = new LinkedHashSet<String>();


    public PrefixTree() {
         
    }

    public void insert(String word) {
        completeWords.add(word);
        StringBuilder prefix = new StringBuilder("");
        for(int e = 0 ; e < word.length(); e++){
            prefix.append(word.charAt(e));
            prefixWords.add(prefix.toString());
        }
    }

    public boolean search(String word) {
        return completeWords.contains(word);
    }

    public boolean startsWith(String prefix) {
        return prefixWords.contains(prefix);
    }
}
