class Solution {
    public int countSeniors(String[] details) {
        // 11 and 12
        int count= 0;
        for(String e : details){
        try {  char fd = e.charAt(11);
           char sd = e.charAt(12);
           int age = ((fd-'0')*10) + (sd-'0');
           count += age > 60? 1 : 0;
           
           }catch(Throwable i ){
            continue;
           }
        }
        return count;
    }
}