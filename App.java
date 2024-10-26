import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int liczba = 0;
        boolean count = false;

        while (!count) {
            System.out.print("Podaj wartość liczbową typu int: ");
            if (userInput.hasNextInt()) {
                liczba = userInput.nextInt();
                count = true;
            } else {
                System.out.println("To nie jest poprawna liczba całkowita. Spróbuj ponownie.");
                userInput.next();
            }
        }
        System.out.println("Podana liczba to: " + liczba);
        userInput.close();
    }
}