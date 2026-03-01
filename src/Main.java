import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        int nc =  sc.nextInt();

        for (int i = 0; i < nc; i++) {
            int sum1 = sc.nextInt();
            int sum2 = sc.nextInt();

            System.out.println(sum1+sum2);
        }

        }

}