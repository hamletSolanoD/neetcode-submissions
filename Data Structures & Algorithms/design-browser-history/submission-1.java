class BrowserHistory {
    ArrayList<String> historical = new ArrayList<>();
    int currentIndex = 0;

    public BrowserHistory(String homepage) {
        historical.add(homepage);
        currentIndex = 0;
    }
    
    public void visit(String url) {
     
         while (historical.size() > currentIndex + 1) {
        historical.remove(historical.size() - 1);
          }
        currentIndex++;
        historical.add(url);

    }

    public String back(int steps) {
        if((currentIndex - steps) < 0) {
            currentIndex = 0;
            return historical.get(0);
            }
        currentIndex -= steps;
        return historical.get(currentIndex);
    }
    
    public String forward(int steps) {
         if((currentIndex + steps) > historical.size()-1) {
            currentIndex = historical.size()-1;
            System.out.println(currentIndex + " " + historical);
            return  historical.get(historical.size()-1);
            }
        currentIndex += steps;
        return historical.get(currentIndex);
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */