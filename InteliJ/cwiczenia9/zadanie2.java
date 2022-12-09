import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita n: ");
        int liczba = scanner.nextInt();
        System.out.println(fibbonaciRec(liczba));
    }
    public static int fibbonaciRec(int n) {
        if (n <= 1)
            return n;
        return fibbonaciRec(n - 1) + fibbonaciRec(n - 2);
    }
}