import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zakomentowana wersja na dowolna ilosc zmiennych
        //System.out.print("Podaj ilosc kolumn w wykresie: ");
        //int kolumny = scanner.nextInt();
        int kolumny = 3;
        int[] wartosci = new int[kolumny];
        int zmienna = 0;
        while( zmienna < kolumny ) {
            System.out.printf("Podaj wartosc wartosc parametru na miejscu %d: ", zmienna);
            wartosci[zmienna++] = scanner.nextInt();
        }
        rysujWykres( wartosci );
    }
    public static void rysujWykres(int[] wartosci) {
        int rows = wartosci.length;
        int maxValue = znajdzMax(wartosci);
        String[] horizontalRow = new String[ maxValue + 1];
        for(int rzedy = 0; rzedy <= maxValue; rzedy++) {
            String wzorTegoRzedu = "";
            int wykresTegoRzedu = maxValue - rzedy;
            for(int kolumny = 0; kolumny < rows; kolumny++) {
                if( wykresTegoRzedu < wartosci[kolumny] ) {
                    wzorTegoRzedu += "* ";
                } else {
                    wzorTegoRzedu += "  ";
                }
            }
            horizontalRow[rzedy] = wzorTegoRzedu;
        }
        for(String wzorek : horizontalRow) {
            System.out.println(wzorek);
        }
    }
    public static int znajdzMax(int[] wartosci) {
        int max = 0;
        for(int value : wartosci) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }
}
