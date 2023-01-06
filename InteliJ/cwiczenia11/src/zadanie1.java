import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar macierzy:");
        int rozmiar = sc.nextInt();
        System.out.print("Macierz to: ");
        System.out.print(Arrays.deepToString(createArray(rozmiar)));
    }
    public static int[][] createArray(int n) {
        int[][] array = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }
        return array;
    }
}