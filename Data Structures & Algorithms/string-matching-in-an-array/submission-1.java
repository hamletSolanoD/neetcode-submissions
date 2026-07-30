class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        for(String actual: words){
            boolean isSubsString = false;
            for(String compareWith: words){
                if(actual.equals(compareWith))continue;
                int  actualCounter = 0;
                for(int compInt = 0; compInt < compareWith.length(); compInt++){
                    if(compareWith.charAt(compInt) == actual.charAt(actualCounter)){
                        actualCounter++;
                        System.out.println(actualCounter + " " +actual);
                        if(actualCounter == actual.length()){
                        System.out.println(compareWith + " " +actual);

                            isSubsString = true;
                            break;
                        }
                    }
                    else{
                        actualCounter = 0;
                    }
                }
             
            }
                 if(isSubsString){
                    ans.add(actual);
                }


        }
        return ans;
    }
}