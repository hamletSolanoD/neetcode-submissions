class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> conversion = new HashMap<>();
        conversion.put('I', 1);
        conversion.put('V', 5);
        conversion.put('X', 10);
        conversion.put('L', 50);
        conversion.put('C', 100);
        conversion.put('D', 500);
        conversion.put('M', 1000);    
    int finalNumber = 0;
    for(int e = 0; e < s.length();e++ ){
        if(e > 0 && conversion.get(s.charAt(e-1)) < conversion.get(s.charAt(e))){
            finalNumber -=  conversion.get(s.charAt(e-1));
            finalNumber +=  conversion.get(s.charAt(e))-conversion.get(s.charAt(e-1));
        }
        else{
            finalNumber += conversion.get(s.charAt(e));
        }
    }
    return finalNumber;
    }
}