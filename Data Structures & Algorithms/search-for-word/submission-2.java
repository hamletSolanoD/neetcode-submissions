
/*
creo que es posible resolver esto sabiendo que es una busqueda en 2D igual con un dfs que siempre 
asuma correcto que avanza a la derecha, siempre avanza a la derecha
pero si al avanzar a la derecha llega a un resultado que no ayuda a completar la palabra bueno entonces retrocede al ultimo qeu si lo ayudo a completar la palabra
luego avanza hacia abajo, y si al avanzar hacia abajo encuentra algo que no le ayuda a completar la palabra entonces regresa.
ahora es importante saber que hay 2 formas de avanzar
avanzar el puntero si
pero es avanzar el puntero consideran la siguiente caracter como inicio de palabra
o avanzar el puntero considerando el siguiente caracter como parte de la suma de la palabra anterior


digamos el ejemplo uno
A se parece a cat ? no
b se parece a cat ?  no
c se parece a cat si
cd se parece a cat no
ca se parece a cat? si
cat se parece a cat? si

asunto complicato en mi ejemplo no se como format cat si hubierta estado la t a la izquierda no a la derecha

creo que esto es porque sigo pensando este problema en una direccion.

el ojetivo es iterar a la siguientesss celdas mientras la palabra continue, es ir creciendo con la celda en todas las direcciones de la celda mientras el partir de X celda lo permita
estilo
A a se parece a cat? no
b se parece a cat? no
c se parece a cat? si
cb se parece a cat no
cd se parece a ccat? no
ca se parece a cat? si
caa se parece a cat? no
caa se parece a cat? no
cat se parece a cat? si
ojo importante no regresar de donde ya vengo,
como me aseguro no regresar de donde ya vengo?
mandando una lista de coordenadas ya pasadas.


entonces mi dfs debe primero iterar todas las celdas de la matriz, entoncces debo tener en el main un for que itera por todas las celdas de la matriz

cada celda invoca un dfs

el dfs al ser invocado dice, primero en la celda que estoy puedo ir a la izquierda?
en la celda que estoy pueddo ir a la derecha?
en la celda que estoy puedo ir arriba?
en la celda que estoy puedo ir abajo?

ahora, que siginifica el puedo ir a X lugar, que 1, no haya ya estado ahi previamente, q 2 no este en un borde que me de out of bound si quiero ir a X lugar

ahora lo mas sencillo de todo, al empezar la comparativa debo empezar con X palabra que llevo formada es un startWith de la X palabra que busco?, si si continuo lo de atras, sino return;
*/ 

class Solution {
    String publicWord;
    int maxX;
    int maxY;
    public boolean exist(char[][] board, String word) {
        publicWord = word;
        boolean isValid = false;
        maxX = board.length;
        maxY = board[0].length;
        for(int x = 0; x < maxX; x++){
            for(int y = 0; y < maxY; y++){
                isValid = dfs(new ArrayList<String>(),"",x,y,board);
                if(isValid) return true;
            }
        }


    return isValid;
    }

    public boolean dfs(ArrayList<String> caminoPrevio,String stringConstruida,int x, int y,char[][] board){  if(caminoPrevio.contains(x+"-"+y)) return false;
        char currentCharacter = board[x][y];
        StringBuilder stringBuilder= new StringBuilder(stringConstruida);
        stringBuilder.append(currentCharacter);
        String stringNueva = stringBuilder.toString();
        if(stringNueva.equals(publicWord)) return true;
        if(!publicWord.startsWith(stringNueva)) return false;
        caminoPrevio.add(x+"-"+y);
        boolean compoundAnswer = false;;
        if(x+1 < maxX){
            compoundAnswer = compoundAnswer || dfs(caminoPrevio, stringNueva, x+1,y,board);
        }
        if(x-1 >= 0 ){
            compoundAnswer = compoundAnswer || dfs(caminoPrevio, stringNueva, x-1,y,board);
        }
         if(y+1 < maxY){
            compoundAnswer = compoundAnswer || dfs(caminoPrevio, stringNueva, x,y+1,board);
        }
        if(y-1 >= 0 ){
            compoundAnswer = compoundAnswer || dfs(caminoPrevio, stringNueva, x,y-1,board);
        }
            caminoPrevio.remove(x + "-" + y);  // ← AÑADE ESTO

        return compoundAnswer;

    }



}
