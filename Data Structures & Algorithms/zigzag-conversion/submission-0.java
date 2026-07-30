class Solution {
    public String convert(String s, int numRows) {
        HashMap< Integer, ArrayList<Character> > wordMap = new HashMap<>();


        int charCounter = 0;

        while(charCounter < s.length()){
            int row = 0;
            for(; row < numRows; row++){
                if(charCounter >=  s.length()) break;
                wordMap.putIfAbsent(row, new ArrayList<Character>());
                wordMap.get(row).add(s.charAt(charCounter));
                charCounter++;
            }
            row = numRows-2;
            int diagonalExtraSpaces = 0;
            for(; row > 0; row--){
                if(charCounter >=  s.length()) break;
                wordMap.putIfAbsent(row, new ArrayList<Character>());
                for(int ext = 0; ext < diagonalExtraSpaces;ext++){
                    wordMap.get(row).add('-');
                }
                wordMap.get(row).add(s.charAt(charCounter));
                charCounter++;
                diagonalExtraSpaces++;
            }
        }

        String FinalString = "";
        for(Map.Entry<Integer, ArrayList<Character>> e : wordMap.entrySet()){
            for(char ReadinChar : e.getValue()){
                if(ReadinChar != '-'){
                    FinalString+= ReadinChar;
                }
            }
        }
        return FinalString;
    }
}