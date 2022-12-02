import java.util.Random;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        int []genArr = generateArray();
        printArray(genArr);
        int []sortedArr = sort(genArr);
        printArray(sortedArr);
        int []revArr = reverse(sortedArr);
        printArray(revArr);
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
        for (int i = 0; i <tablica.length; i++){
            int index = i;
            for (int j = i ; j <= tablica.length-1; j++){
                if (tablica[j] < tablica[index]){
                    index = j;
                }
            }
            int temp = tablica[i];
            tablica[i] = tablica[index];
            tablica[index] = temp;
        }
        for (int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
        return tablica;
    }
    public static int [] reverse(int[] tablica) {
        for(int i=tablica.length-1;i>=0;i--)
            System.out.print(tablica[i] + "  ");
        return tablica;
    }
    public static boolean equalsReverse(int[] tablica1, int[] tablica2) {
        if (tablica1.length != tablica2.length)
        {
            return false;
        }
        for (int i = 0; i < tablica1.length; i++)
        {
            if (tablica1[i] != tablica2[tablica2.length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}
