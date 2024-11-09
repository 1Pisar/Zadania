import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbe A: ");
        int A = userInput.nextInt();
        System.out.print("Podaj liczbe B: ");
        int B = userInput.nextInt();
        userInput.close();

        if (A >= B) {
            System.out.println("Blad");
            return;
        }

        int sumWhile = 0;
        int i = A;

        while (i <= B) {
            sumWhile += 1;
            i++;
        }

        int sumdoWhile = 0;
        i = A;
        do {
            sumdoWhile += i;
            i++;
        } while (i <= B);

        int sumFor = 0;
        for (i = A; i <=B; i++) {
            sumFor += i;
        }
        System.out.println(sumWhile + " " + sumdoWhile + " " + sumFor);
    }
}
