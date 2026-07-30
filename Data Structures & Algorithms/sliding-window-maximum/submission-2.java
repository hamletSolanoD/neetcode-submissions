class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();//el deque guarda los index
        int res[] = new int[nums.length-k +1];
        
        int l = 0;
        int r = 0;
        while(r < nums.length){
            // si el valor ultimo guardado 8, 7, 5, son menores que el nuevo valor a guardar
            // o sea si el ultima valor mas pequeño es menor al nuevo a guardar, ya no los necesito, ya tengo un nuevo mayor
            // puedo borrarlos
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[r]){
                dq.removeLast();
            }
            // en todo caso si hubiera sido el valor 10,8,5 y voy a insertar un 4, mi valor mas grande siguen siendo
            // los anteriores, por tanto sigo guardandolos,  
            dq.addLast(r);
            while(l > dq.getFirst()){ //mi ultimo valor mas grande sigue cabbiendo en mi ventana?
            // si tengo 87523, y voy en 752 el 8 en 0 ya no es mas grande que mi l en 1, por tanto hay qeu sacarlo
            dq.removeFirst();
            }
            if((r-l+1) == k){
            res[l] = nums[dq.getFirst()];
            l++;
            }
            r++;
        }
        return res;
    }
}
