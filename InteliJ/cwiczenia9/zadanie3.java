import java.util.Arrays;

public class zadanie3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int element: arr) {
            System.out.println(element);
        }
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseArray(int[] x){
        reverse(x, 0, x.length -1);
    }
    public static void reverse(int[] x, int i, int j){
        if(i<j){//Swap
            int tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }
}