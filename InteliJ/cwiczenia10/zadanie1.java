import java.io.*;

public class zadanie1 {
    public static void main(String[] args) throws IOException {
        File plik = new File("data.txt");
        BufferedReader reader = new BufferedReader(new FileReader(plik));
        String[] text = new String[2];
        String tmp;
        int i = 0;
        while((tmp = reader.readLine())!=null){
            text[i]=tmp;
            System.out.println(text[i]);
            i++;
        }
        reader.close();
        File plik2 = new File("data2.txt");
        plik2.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(plik2));
        for (int j=0; j < text.length; j++){
            writer.write(text[j]);
            writer.newLine();
        }
        writer.close();
    }
    public static String[] splitBy(String line, String separator){
        String[] arrOfStr = line.split(separator, 2);
        for (String a : arrOfStr)
            System.out.println(a);
        return new String[0];
    }

}
