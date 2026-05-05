package OnlineJudge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J484 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        List<Integer> numb = new ArrayList<>();

        boolean flag = true;
        while (flag){
            int n = sc.nextInt();
            numb.add(n);
            if(n == 0){
                flag = false;
            }
        }

        for(int i = 0; i < numb.size(); i ++ ){

            int a = 3;
            int b = numb.get(i) - a;

            while(a <= b) {

                if (isPrimo(a) && isPrimo(b) ) {
                    System.out.println(numb.get(i) + " = " + a + " + " + b);
                    break;

                } else {
                    a += 2;
                    b -= 2;
                }
            }
        }
    }

    public static boolean isPrimo(int n){
        if(n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
            return true;

    }

}
