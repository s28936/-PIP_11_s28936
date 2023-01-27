import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //zad1
        String imie = "Patryk Maliszewski";
        String mail = "patryk.maliszewski@gmail.com";
        String kraj = "Polska";
        Osoba osoba = new Osoba(imie, mail, kraj);
        System.out.println(osoba);
        //zad2
        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("src/data.txt"));
        String line = reader.readLine();
        while (line != null) {
            listOfStrings.add(line);
            line = reader.readLine();
        }
        reader.close();
        String[] array = listOfStrings.toArray(new String[0]);
        for (String str : array) {
            System.out.println(str);
        }
        String[][] tablica2d = new String[10][3];
        for (int i=0; i< array.length; i++){
            tablica2d[i] = splitBy(array[i],",");
        }
        System.out.println(Arrays.deepToString(tablica2d));
    }
    public static String[] splitBy(String line, String separator){
        String[] tablica = line.split(separator);
        return tablica;
    }
}
