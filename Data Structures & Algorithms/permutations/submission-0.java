class Solution {
/*

Mi objetivo es al momento de querer permutar todos los numeros lo que hare sera primero mandar una lista de numeros disponibles
1. lista de numeros disponibles es igual a N, n digamos 3
2. en el dfs hare un for, en el for mandare por cada N a llamar otro dfs que mandara a llamar a sus hijos con N-1,
dejando menos posibilidades
esto iterara e iterara N cantidad de veces, hasta llegar a n =0;
cuando N sea igual a 0, lo unico que guardaremos sera El array final, y el Key que construyo hasta ese momento


Entonces necesito pasar en el DFS el array ActualFormado, el array Disponible para Formar, y el key actual construido 

*/
    TreeMap<String, List<Integer>> allPermutationsAndKey = new TreeMap<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> remaining =  new ArrayList<Integer>();
        Arrays.stream(nums).forEach(remaining::add);
        dfs(new ArrayList<Integer>(), "", remaining);

        return new ArrayList<List<Integer>>(allPermutationsAndKey.values());
    }

    public void dfs(List<Integer> currentCompoundList, String currentKey, List<Integer> missingNumbers){
        if(missingNumbers.size() == 0 && currentCompoundList.size()>  0){
            allPermutationsAndKey.put(currentKey,new ArrayList<>(currentCompoundList));
        }

        List<Integer> missingConcurrentError = new ArrayList<>(missingNumbers);
        for(int e : missingConcurrentError){
            currentCompoundList.add(e);
            missingNumbers.remove(Integer.valueOf(e));
            String newKey = currentKey+e;
            dfs(currentCompoundList,newKey,missingNumbers);
            currentCompoundList.remove(Integer.valueOf(e));
            missingNumbers.add(e);
        }


    }
}
