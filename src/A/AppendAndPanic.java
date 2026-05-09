package A;

import java.util.Scanner;

public class AppendAndPanic {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        for (int i = word.length()-1; i >= 0; i--){

            String aux = String.valueOf(word.charAt(i));

            if(i != word.length()-1){

                String subString = word.substring(i+1);
                if(verifyExistance(aux, subString)){
                    String subString2 = word.substring(0, i+1);
                    int cont = subString2.length();
                    System.out.println(cont);
                    break;
                }
            }
        }
    }

    public static boolean verifyExistance(String aux, String subString){

        for(int i = 0 ; i < subString.length(); i++){
            if(aux.equals(String.valueOf(subString.charAt(i)))){
                return true;
            }
        }
        return false;
    }
}
