class PrefixTree {
    LinkedHashSet<String> prefixWords = new LinkedHashSet<String>();
    LinkedHashSet<String> completeWords = new LinkedHashSet<String>();


    public PrefixTree() {
         
    }

    public void insert(String word) {
        completeWords.add(word);
        String prefix = "";
        for(char a : word.toCharArray()){
            prefix += a;
            prefixWords.add(prefix);
        }
    }

    public boolean search(String word) {
        return completeWords.contains(word);
    }

    public boolean startsWith(String prefix) {
        return prefixWords.contains(prefix);
    }
}
