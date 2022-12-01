import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita n: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        wyswietl(x);
    }
    public static void wyswietl(int limit) {
        int n = limit;
        if (n>0) {
            for (int i = 0; i <= n; i++)
                System.out.print(i + " ");
        } else if (n<0) {
            for (int i = 0; i >= n; i--)
                System.out.print(i + " ");
        } else {
            System.out.print("Podales limit n rowny 0");
        }
    }
}
