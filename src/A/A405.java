package A;

import java.util.List;
import java.util.Scanner;

public class A405 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] list = new int[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        for(int j = 0; j < n; j++){
            int aux1;
            for(int i = j +1; i < list.length; i++){
                if(list[i] <= list[j]){
                     aux1 = list[j];
                     list[j] = list[i];
                     list[i] = aux1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            // Imprime el número seguido de un espacio
            System.out.print(list[i] + " ");
        }

    }
}
