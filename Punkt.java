// Klasa Punkt
public class Punkt {
    private int x;
    private int y;

    // Konstruktor ustawiający współrzędne
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metoda zwiększająca wartość współrzędnej x o 1
    public void zwiekszX() {
        x += 1;
    }

    // Metoda zwiększająca wartość współrzędnej y o 1
    public void zwiekszY() {
        y += 1;
    }

    // Metoda zmieniająca wartość współrzędnej x o dowolną wartość
    public void zmienX(int wartosc) {
        x += wartosc;
    }

    // Metoda zmieniająca wartość współrzędnej y o dowolną wartość
    public void zmienY(int wartosc) {
        y += wartosc;
    }

    // Metoda zwracająca wartość współrzędnej x
    public int getX() {
        return x;
    }

    // Metoda zwracająca wartość współrzędnej y
    public int getY() {
        return y;
    }

    // Metoda wyświetlająca wartości współrzędnych
    public void wyswietlWspolrzedne() {
        System.out.println("Współrzędne punktu: (" + x + ", " + y + ")");
    }
}

// Klasa testowa TestPunkt
public class TestPunkt {
    public static void main(String[] args) {
        // Tworzenie obiektu Punkt
        Punkt punkt = new Punkt(2, 3);

        // Wyświetlenie początkowych współrzędnych
        punkt.wyswietlWspolrzedne();

        // Zwiększenie wartości współrzędnej x o 1
        punkt.zwiekszX();
        punkt.wyswietlWspolrzedne();

        // Zwiększenie wartości współrzędnej y o 1
        punkt.zwiekszY();
        punkt.wyswietlWspolrzedne();

        // Zmiana wartości współrzędnej x o 5
        punkt.zmienX(5);
        punkt.wyswietlWspolrzedne();

        // Zmiana wartości współrzędnej y o -2
        punkt.zmienY(-2);
        punkt.wyswietlWspolrzedne();

        // Wyświetlenie wartości poszczególnych współrzędnych
        System.out.println("Wartość x: " + punkt.getX());
        System.out.println("Wartość y: " + punkt.getY());
    }
}