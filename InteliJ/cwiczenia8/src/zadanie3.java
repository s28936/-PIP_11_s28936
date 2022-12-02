public class zadanie3 {
    public static void main(String[] args) {
        int[] tablica = {10,20,30,40,50,60,70,80,90};
        System.out.println("Originalna tablica:");
        for(int i=0;i<tablica.length;i++)
            System.out.print(tablica[i] + "  ");
        System.out.println();
        System.out.println("Odwrocona kolejnosc w tablicy:");
        metoda1(tablica);
    }
    public static void metoda1(int[] tablica) {
        for(int i=tablica.length-1;i>=0;i--)
            System.out.print(tablica[i] + "  ");
    }
}
