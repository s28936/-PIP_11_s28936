import java.util.Arrays;

public class zadanie4 {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 1, 9, 3, 2, 6, 10 };
        int toCheckValue = 3;
        System.out.println("Array: "+ Arrays.toString(arr));
        forCheck(arr, toCheckValue);
    }
    private static void forCheck(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        System.out.println("Is " + toCheckValue + " present in the array: " + test);
    }
}
