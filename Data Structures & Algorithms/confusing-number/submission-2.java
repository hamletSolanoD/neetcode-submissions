class Solution {


    public char rotateDigit(char n){
        switch(n){
            case '9': return '6';
            case '6': return '9';
        }
        return n;
    }
    public boolean isValid(char n){
        switch (n) {
            case '2': return false;
            case '3': return false;
            case '4': return false;
            case '5': return false;
            case '7': return false;
        }
        return true;
    }

    public boolean confusingNumber(int n) {
        String finalNum = "";
        String reverseNum =  new StringBuilder(n+"").reverse().toString();
        for(char a :reverseNum.toCharArray() ){
            if(!isValid(a))return false;
            finalNum += rotateDigit(a);
        }

        System.out.println(n+" -" + "  " + finalNum);
        return !(n+"").equals(finalNum);        
    }

}

