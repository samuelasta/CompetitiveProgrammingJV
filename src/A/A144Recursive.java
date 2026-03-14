package A;

import java.util.Scanner;

public class A144Recursive {

    public static int posMay = 0;
    public static int posMen = 0;
    public static int maxValue = -1;
    public static int minValue = 100;
    public static int result = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int [] list = new int[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        positions(list, 0);

        if(posMay > posMen){
            result --;
        }

        result = posMay + (n - 1 - posMen);

        System.out.println(result);

    }

    public static void positions(int [] list, int n){

        if(n == list.length){
            return;
        }

        if (list[n] > maxValue) {
            posMen = n;
            maxValue = list[n];

        }

        if (list[n] < minValue) {
            posMay = n;
            minValue = list[n];
        }

        positions(list, n + 1);

    }


}
