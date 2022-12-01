import java.util.Scanner;
import java.util.Random;
public class zadanie2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita n: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Metoda 1: ");
        metoda1(x);
        System.out.println("Metoda 2: ");
        metoda2(x);
    }
    public static void metoda1(int limit) {
        Random rand = new Random();
        int i = 0;
        do{
            System.out.println(rand.nextInt());
            i++;
        }
        while(i<limit);
    }
    public static void metoda2(int limit) {
        Random rand = new Random();
        int i =0;
        while(i<limit) {
            System.out.println(rand.nextInt());
            i++;
        }
    }
}