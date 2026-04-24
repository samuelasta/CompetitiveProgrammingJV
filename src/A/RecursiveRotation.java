package A;

public class RecursiveRotation {

    // devuelve la matriz rotada
    public static String [][] girarRuleta(String[][] matriz, int giros, int sizeFilas, int sizeColumnas){

        if(giros == 0){
            return matriz;
        }

        String [][] nuevaMatriz = new String[sizeFilas][sizeColumnas];

        if(giros > 0) {
            matriz =  rotarMatriz(matriz, nuevaMatriz, sizeFilas, sizeColumnas );
            girarRuleta(matriz, giros - 1, sizeFilas, sizeColumnas);
        }

        else{
            matriz =  rotarMatriz(matriz, nuevaMatriz, sizeFilas, sizeColumnas);
            girarRuleta(matriz, giros + 1, sizeFilas, sizeColumnas);
        }

        return matriz;
    }

    public static String [][] rotarMatriz(String [][] matriz, String [][] nuevaMatriz, int sizeFilas, int sizeColumnas){


        return null;
    }



    public static void main(String[] args) {

        rotarMatriz(null, null, 0, 0);
    }

}
