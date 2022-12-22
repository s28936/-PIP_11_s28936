import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zadanie1234 {
    public static void main(String[] args) throws IOException {
        System.out.println("Zadanie1: ");
        String test = "Podziel@mnie@na@czesci";
        String podzielnik = "@";
        System.out.println("array: "+Arrays.toString(splitBy(test, podzielnik)));
        System.out.println("Zadanie2: ");
        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
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
        System.out.println("Zadanie3: ");
        String[][] tablica2d = new String[10][3];
        for (int i=0; i< array.length; i++){
            tablica2d[i] = splitBy(array[i],",");
        }
        System.out.println(Arrays.deepToString(tablica2d));
        System.out.println("Zadanie4 w pliku data2");
        File plik2 = new File("data2.txt");
        plik2.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(plik2));
        for (int x=0; x< array.length; x++){
            writer.write(x+","+array[x]);
            writer.newLine();
        }
        writer.close();

    }
    public static String[] splitBy(String line, String separator){
        String[] tablica = line.split(separator);
        return tablica;
    }
}
