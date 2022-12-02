import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        int tablica[] = metoda1();
        metoda2(tablica);
    }
    public static int []metoda1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita n: ");
        int elementy = scanner.nextInt();
        int[] tablica = new int[elementy];
        Random rd = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rd.nextInt(100);
        }
        return tablica;
    }
    public static void metoda2(int[] tablica) {
        for (int i = 0; i < tablica.length; i++)
            System.out.println(tablica[i]);
    }
}
