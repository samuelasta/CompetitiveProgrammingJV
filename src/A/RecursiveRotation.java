package A;

import java.util.jar.JarEntry;

public class RecursiveRotation {

    // devuelve la matriz rotada
    public static String [][] girarRuleta(String[][] matriz, int giros, int sizeFilas, int sizeColumnas){

        if(giros == 0){
            return matriz;
        }

        String [][] nuevaMatriz = new String[sizeColumnas][sizeFilas];

        nuevaMatriz = rotarMatriz(matriz, nuevaMatriz, sizeFilas, sizeColumnas, 0, 0, giros );

        if(giros > 0) {
            return girarRuleta(nuevaMatriz, giros - 1, sizeFilas, sizeColumnas);
        }

        else{
            return girarRuleta(nuevaMatriz, giros + 1, sizeFilas, sizeColumnas);
        }
    }

    public static String [][] rotarMatriz(String [][] matriz, String [][] nuevaMatriz, int sizeFilas, int sizeColumnas, int i, int j, int giros) {

        if (i == sizeFilas) {
            return nuevaMatriz;
        }

        if (giros > 0) {
            nuevaMatriz[j][(sizeFilas - 1) - i] = matriz[i][j];
        }
        else{
            nuevaMatriz[(sizeColumnas - 1) - j] [i] = matriz[i][j];
        }

        if(j == sizeColumnas -1){
            return rotarMatriz(matriz, nuevaMatriz, sizeFilas, sizeColumnas,i + 1, 0, giros);
        }
        else return rotarMatriz(matriz, nuevaMatriz, sizeFilas, sizeColumnas, i , j + 1, giros);
    }

    public static void print(String [][] matriz, int i, int j){
        if(i == matriz.length){
            return;
        }
        String car = matriz [i][j];
        System.out.print(car+ " ");
        if(j == matriz[0].length - 1){
            System.out.println();
        }

        if(j == matriz[0].length - 1){
            print(matriz, i + 1, 0);
        }
        else{
            print(matriz, i, j + 1);
        }
    }

    public static void main(String[] args) {

        String [][] matriz = {
                {"N", "J", "K"},
                {"I", "Z", "Y"},
                {"U", "E", "R"}
        };

        String [][] rotatedMatriz = girarRuleta(matriz, 2,3, 3);
        print(rotatedMatriz, 0,0);

    }

}
