package A;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class InvertInt {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        while( n > 0) {

            int modulo = n % 10;
            n = n / 10;
            result = ( result * 10) + modulo;
        }

        System.out.println(result);
    }
}
