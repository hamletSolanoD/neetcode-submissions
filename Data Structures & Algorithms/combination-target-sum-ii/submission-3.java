
    /*
        intento numero 2 intentare cmoo en mi primera opcion tener el puntero pero aparte del puntero intentar meter el for interno
        asi la pregunta no es uso el numero actual o no lo uso
        es 
        uso el numero actual y QUE MAS PUEDO USAR DESDE AQUI PARA LOGAR LLEGAR AL RESULTADO.
        el punto de usar el for es para asumir que uso el actual y tengo N cantidad posible a futuro de cosas a probar para ver si llego al resultado o no.

        aunqeu aun me queda la duda cuando usar la opcion de Uso el actual o NO lo uso, o sea unicamente el puntero.

        y cuando usar el puntero +el for de N caminos posibles
        mi primer error fue que solo estaba consideran la rama de los 0 
        me falto considerar las demas ramas de todo contra todo, para eso el for exterior
        */

class Solution {
    
    int publicTarget;
    int publicCandidates[];
    LinkedHashSet<List<Integer>> results = new LinkedHashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        

        publicTarget = target;
        publicCandidates = candidates;

         dfs(new ArrayList<>(), 0,-1);
 
        return new ArrayList<>(results);
    }


    public void dfs(List<Integer> currentPath, int currentSum, int currentPointer){
        if(currentPointer >= publicCandidates.length || currentSum > publicTarget ) return;
       if(currentSum == publicTarget){
            results.add(new ArrayList<>(currentPath));
            return;
        }
        int prev = -1;
        for(int e = currentPointer+1; e < publicCandidates.length; e ++){
            if(publicCandidates[e] == prev) continue;

            int newSum =  currentSum +publicCandidates[e];
            List<Integer> newPath = new ArrayList<>(currentPath);
            newPath.add(publicCandidates[e]);
      
            dfs(newPath,newSum, e);
        

            prev = publicCandidates[e];
        }
    }
}
