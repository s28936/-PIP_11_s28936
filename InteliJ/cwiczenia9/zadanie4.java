import java.util.Arrays;

public class zadanie4 {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 1, 9, 3, 2, 6, 10 };
        int klucz = 6;
        System.out.println("Twoja tablica to: "+ Arrays.toString(arr));
        forCheck(arr, klucz);
        recursionCheck(arr, klucz, arr.length);
    }
    private static boolean forCheck(int[] arr, int klucz)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == klucz) {
                test = true;
                break;
            }
        }
        System.out.println("Twój klucz " + klucz + " znajduje sie w tablicy: " + test);
        return test;
    }
    private static boolean recursionCheck(int[] arr, int klucz, int size){
        if (size==0){
            System.out.println("Blad - tablica ma rozmiar 0 i nie zawiera elementów");
            return false;
        }
        if (arr[size-1]==klucz){
            System.out.println("Twoj klucz "+ klucz +" znajduje sie w tablicy");
            return true;
        }
        return recursionCheck(arr, klucz, size-1);
    }
}
