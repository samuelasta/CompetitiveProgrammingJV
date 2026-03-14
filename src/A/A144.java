package A;

import java.util.Scanner;

public class A144 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int may = -1;
        int men = 100;
        int posMay = 0;
        int posMen = 0;
        int result = 0;

        int [] list = new int[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        for(int i = 0; i < n ; i++){
            if(list[i] > may){
                may = list[i];
                posMay = i;
            }
            if(list[i] <= men ){
                men = list[i];
                posMen = i;
            }
        }

        result = posMay + (n - 1 - posMen);

        if(posMay > posMen){
            result --;
        }
        System.out.println(result);

    }
}
