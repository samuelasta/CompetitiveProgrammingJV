package A;

import java.util.Scanner;

public class InvertNumberList {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] list = new int[n];

        for(int i = 0 ; i < n ;i ++){
            list[i] = sc.nextInt();
        }

        for(int i = 0; i < n / 2; i++){

            int left = i;
            int right = n - 1 - i;

            int aux = list[left];
            list[left] = list[right];
            list[right] = aux;
        }

        for (int i = 0 ; i < n ; i ++){
            System.out.print(list[i] + " ");
        }
    }
}
