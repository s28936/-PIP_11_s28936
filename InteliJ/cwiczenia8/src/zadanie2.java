public class zadanie2 {
    public static void main(String[] args) {
        int[] tablica = new int[] { 12,24,25,75,65,1,74,32,69,8,20,1,78,6 };
        metoda1(tablica);
    }
    public static void metoda1(int[] tablica) {
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
    }
}