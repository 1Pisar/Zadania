import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        boolean done = false;

        while (!done) {
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.print("Podaj liczbe: ");
                int number = userInput.nextInt();
                userInput.close();

                if (number < 1) {
                    System.out.println("Podana liczba powinna byc wieksza od 0 ");
                } else {
                    for (int i = 1; i <= number; i++) {}
                    done = true;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Prosze podac liczbe calkowita ");
            }
        }
    }
}