package A;

import java.util.Scanner;

public class TwoPintersTechnique {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for( int j = i + 1 ; j < n ; j++){
                if (list[i] > list[j]) {
                    int aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");

        }
    }
}
