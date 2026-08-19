/* la idea es usar n cantidad de veces el mismo numero hasta que nos pasemos del maximo posible, si nos pasamos del maximo posible nos regresamos a la ultima opcion donde no usamos ese numero si no que usamos el siguiente util.


*/

class Solution {

    LinkedHashSet<List<Integer>> mapOfApprovedNumbers = new LinkedHashSet<>();

    int publicNums[];
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        if(target == 0) new ArrayList<ArrayList<Integer>>();
        publicNums = nums;
        dfs(new ArrayList<>(),0,target);
        return new ArrayList<>(mapOfApprovedNumbers);

    }

    public void dfs(ArrayList<Integer> list,int pointer, int remaining){
        if(pointer >= publicNums.length) return;
        if(remaining == 0){
        mapOfApprovedNumbers.add(list);
        return;    
        }
        if(remaining < 0){
        return;    
        }
        
        int currentIteration = publicNums[pointer];
        ArrayList<Integer> duplicated = new ArrayList<>(list);
        duplicated.add(currentIteration);
        dfs(duplicated, pointer, remaining-currentIteration);
        dfs(list, pointer+1,remaining);



       
    }
}
