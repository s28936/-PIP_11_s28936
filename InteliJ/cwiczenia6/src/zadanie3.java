import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Witamy w kalkulatorze!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczby, na ktorych chcesz wykonac dzialanie: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Wybierz dzialanie:");
        System.out.println("ADD dla dodawania");
        System.out.println("SUB dla odejmowania");
        System.out.println("DIV dla dzielenia");
        System.out.println("MUL dla mnozenia");
        sc.nextLine();
        String wybor = sc.nextLine();
        switch (wybor) {
            case "ADD":
                add(x,y);
                break;
            case "SUB":
                sub(x,y);
                break;
            case "DIV":
                div(x,y);
                break;
            case "MUL":
                mul(x,y);
                break;
            default:
                System.out.println("Błędny wybór!");
        }
    }
    public static void add(int liczba1, int liczba2) {
        int liczba3 = liczba1 + liczba2;
        int liczba4 = absoluteVal(liczba3);
        System.out.println("Wynik = " + liczba4);
        System.out.println();
    }
    public static void sub(int liczba1, int liczba2) {
        int liczba3 = liczba1 - liczba2;
        int liczba4 = absoluteVal(liczba3);
        System.out.println("Wynik = " + liczba4);
        System.out.println();
    }
    public static void div(int liczba1, int liczba2) {
        int liczba3 = liczba1 / liczba2;
        int liczba4 = absoluteVal(liczba3);
        System.out.println("Wynik = " + liczba4);
        System.out.println();
    }
    public static void mul(int liczba1, int liczba2) {
        int liczba3 = liczba1 * liczba2;
        int liczba4 = absoluteVal(liczba3);
        System.out.println("Wynik = " + liczba4);
        System.out.println();
    }
    public static int absoluteVal(int liczba) {
        int b;
        if(liczba<0){
            b = -liczba;
        }
        else {
            b = liczba;
        }
        return b;
    }
}
