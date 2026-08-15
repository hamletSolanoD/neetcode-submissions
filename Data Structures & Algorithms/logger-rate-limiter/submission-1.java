class Logger {
    HashMap<String, ArrayList<Integer>> messageTimestap = new HashMap<>();
    public Logger() {
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean isValid = true;
        ArrayList<Integer> timeStapOfTheMessage;
        if(messageTimestap.containsKey(message)){
            timeStapOfTheMessage = messageTimestap.get(message);
            for(int tmps: timeStapOfTheMessage){
               int diff = Math.abs(timestamp-tmps);
               isValid = diff >= 10;
               if(!isValid){
                break;
               }
            }
        }
        else{
            timeStapOfTheMessage = new ArrayList<>();
            timeStapOfTheMessage.add(timestamp);
            messageTimestap.put(message, timeStapOfTheMessage);
        }
        if(isValid){
            timeStapOfTheMessage = messageTimestap.get(message);
            timeStapOfTheMessage.add(timestamp);
            messageTimestap.put(message, timeStapOfTheMessage);
        }
        return isValid;
        

    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
