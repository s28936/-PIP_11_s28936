import java.util.Arrays;

public class zadanie2 {
    public static void main(String[] args) {
        int[][] array1 = {{2, 1}, {3, 7}};
        int[][] array2 = {{6, 9}, {2, 3}};
        int[][] sum = addArrays(array1, array2);
        System.out.println(Arrays.deepToString(sum));
    }
    public static int[][] addArrays(int[][] array1, int[][] array2) {
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            throw new IllegalArgumentException("Arrays must have the same size");
        }
        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }
}