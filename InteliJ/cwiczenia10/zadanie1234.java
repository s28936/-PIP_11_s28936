import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zadanie1234 {
    public static void main(String[] args) throws IOException {
        //Zad1
        String test = "Podziel@mnie@na@czesci";
        String podzielnik = "@";
        splitBy(test, podzielnik);
       //Zad2
        List<String> listOfStrings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line = reader.readLine();
        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = reader.readLine();
        }
        // closing bufferreader object
        reader.close();
        // storing the data in arraylist to array
        String[] array = listOfStrings.toArray(new String[0]);
        // printing each line of file
        // which is stored in array
        for (String str : array) {
            System.out.println(str);
        }
        //zadanie3 - poprawic zad1 aby zwracalo array'a
        String[][] tablica2d = new String[10][3];
        for (int i=0; i< tablica2d.length; i++){
            for (int j=0; j<tablica2d[i].length; j++){
                tablica2d[i][j]= splitBy(tablica2d[i],",");
            }
        }
        System.out.println(Arrays.deepToString(tablica2d));
    }
    public static String[] splitBy(String line, String separator){
        //poprawic aby dawalo arraya na wyjsciu
        String[] tablica = java.util.Arrays.toString(line.split(separator));
        return
    }
}
