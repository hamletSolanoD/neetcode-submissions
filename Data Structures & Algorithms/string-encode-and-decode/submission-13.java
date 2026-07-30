class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(String f : strs){
            s += f+"-";
        }
        return s;
    }

    public List<String> decode(String str) {
    if (str.equals("-")) return Arrays.asList(new String[]{""});
    if(str.equals("")) return Arrays.asList(new String[0]);
       return  Arrays.asList(str.split("-")); 
    }
}
