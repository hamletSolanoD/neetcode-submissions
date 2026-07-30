class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int cars[][] = new int[position.length][2]; // position,speed, stepsneeded 
        for(int e = 0; e < position.length; e++){
            cars[e][0] = position[e];
            cars[e][1] = speed[e];
        }
        Arrays.sort(cars, (c1,c2) -> {return Integer.compare(c2[0],c1[0]); });
        
        double maxStepsNeeded  = 0 ;
        int fleetes = 0;
        for(int[] car: cars){
            double currentStepsNeeded = (double)( target-car[0]) / car[1];
            if(currentStepsNeeded > maxStepsNeeded){
                fleetes++;
                maxStepsNeeded = currentStepsNeeded;
            }
        }
        return fleetes;
        
        
    }
}
