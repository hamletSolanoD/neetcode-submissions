class Solution {
    public class car implements Comparable<car>{
        int initialPosition = 0;
        int speed = 0;
        double stepsNeeded = 0;
        public car(int initPosition, int speed, int target){
            this.initialPosition = initPosition;
            this.speed = speed;
            this.stepsNeeded = (double) (target-initPosition)/speed;
        }
        public int compareTo(car compareCar){
            return Integer.compare( compareCar.initialPosition,this.initialPosition);
        }
    }


    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<car> cars = new ArrayList<car>();
        for(int e = 0; e < position.length; e++){
           cars.add(new car(position[e],speed[e],target));
        }
        Collections.sort(cars);

        double maxTime = cars.get(0).stepsNeeded;
        int fleets = 1;
        for(car c : cars){
           if(c.stepsNeeded > maxTime){
                maxTime = c.stepsNeeded;
                fleets++;
           }
        }   

       return fleets;
    }
}
