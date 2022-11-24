import java.util.Random;
public class zadanie4 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getAlphaNumericString(n));
        }
    public static String getAlphaNumericString(int n)
    {
        String upperAlfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlfabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        // laczymy stringi
        String alphaNumeric = upperAlfabet + lowerAlfabet + numbers;
        // tworzymy random string buildera
        StringBuilder sb = new StringBuilder();
        // tworzymy objekt klasy random
        Random random = new Random();
        // specify length of random string
        int dlugoscRandomStringa = n;
        for(int i = 0; i < dlugoscRandomStringa; i++) {
            // tworzymy losowy numer indexu
            int index = random.nextInt(alphaNumeric.length());
            // bierzemy znak wskazany przez wygenerowany index w stringu
            char randomChar = alphaNumeric.charAt(index);
            // dodajemy wylosowany znak do zmiennej buildera sb
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return sb.toString();
    }
}
