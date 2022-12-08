import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        int []genArr = generateArray();
        printArray(genArr);
        System.out.println("Powyzej jest generated array");
        int []sortedArr = sort(genArr);
        printArray(sortedArr);
        System.out.println("Powyzej jest sorted array");
        int []revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println("Powyzej jest reversed array");
        System.out.println(equalsReverse(sortedArr,revArr));
    }
    public static int []generateArray() {
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
    public static void printArray(int[] tablica) {
        for (int i = 0; i < tablica.length; i++)
            System.out.println(tablica[i]);
    }
    public static int [] sort(int[] tablica) {
        int[] kopia = Arrays.copyOf(tablica,tablica.length);
        for (int i = 0; i <kopia.length; i++){
            int index = i;
            for (int j = i ; j <= kopia.length-1; j++){
                if (kopia[j] < kopia[index]){
                    index = j;
                }
            }
            int temp = kopia[i];
            kopia[i] = kopia[index];
            kopia[index] = temp;
        }
        return kopia;
    }
    public static int [] reverse(int[] tablica) {
        int[] kopia = Arrays.copyOf(tablica,tablica.length);
        int temp;
        for (int i = 0; i < kopia.length / 2; i++) {
            temp = kopia[i];
            kopia[i] = kopia[kopia.length - i - 1];
            kopia[kopia.length - i - 1] = temp;
        }
        return kopia;
    }
    public static boolean equalsReverse(int[] tablica1, int[] tablica2) {
        if (tablica1.length != tablica2.length)
        {
            System.out.println("Blad1");
            return false;
        }
        int dlugosc = tablica1.length;
        for (int i = 0; i < dlugosc; i++) {
            if (tablica1[i] != tablica2[tablica2.length - 1 - i])
            {
                System.out.println("Blad nr" + i);
                return false;
            }
        }
        return true;
    }
}
