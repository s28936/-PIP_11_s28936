public class zadanie3 {
    public static void main(String[] args) {
        int[] tablica = {10,20,30,40,50,60,70,80,90};
        System.out.println("Originalna tablica:");
        for(int i=0;i<tablica.length;i++)
            System.out.print(tablica[i] + "  ");
        System.out.println();
        System.out.println("Odwrocona kolejnosc w tablicy:");
        metoda1(tablica);
        for(int i=0;i<tablica.length;i++)
            System.out.print(tablica[i] + "  ");
    }
    public static int[] metoda1(int[] tablica) {
        int temp;
        for (int i = 0; i < tablica.length / 2; i++) {
            temp = tablica[i];
            tablica[i] = tablica[tablica.length - i - 1];
            tablica[tablica.length - i - 1] = temp;
        }
        return tablica;
    }
}
