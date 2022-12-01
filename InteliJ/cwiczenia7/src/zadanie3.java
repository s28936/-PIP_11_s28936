import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 ==0 ) {
            n = n -1;
        } else {
            n = n;
        }
        wzor1(n);
        wzor2(n);
    }
    public static void wzor1(int limit) {
        //rzedy
        for (int i = 0; i < limit; i++) {
            //kolumny
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            //przesuwamy kursor po druku nowej linii
            System.out.println();
        }
    }
    public static void wzor2(int limit) {
        int i, j, row = limit;
        //rzedy
        for (i=0; i<row; i++) {
            //przesuniecie w srodek
            for (j=row-i; j>1; j--) {
                //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            //przesuwamy kursor po druku nowej linii
            System.out.println();
        }
    }
}