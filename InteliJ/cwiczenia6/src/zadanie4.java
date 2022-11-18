import java.util.*;
import java.nio.charset.*;

public class zadanie4 {
    public static void main(String[] args) {
        /*System.out.println("Jakiej dlugosci ma byc losowy string?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); */
        int n = 5;
        System.out.println(getAlphaNumericString(n));
        }
    public static String getAlphaNumericString(int n)
    {

        // length is bounded by 256 Character
        byte[] array = new byte[256];
        new Random().nextBytes(array);

        String randomString = new String(array, Charset.forName("UTF-8"));

        // Create a StringBuffer to store the result
        StringBuffer r = new StringBuffer();

        // Append alphanumeric characters from the generated random String into the result
        for (int k = 0; k < randomString.length(); k++) {

            char ch = randomString.charAt(k);

            if (((ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')
                    || (ch >= '0' && ch <= '9'))
                    && (n > 0)) {

                r.append(ch);
                n--;
            }
        }

        // return the resultant string
        return r.toString();
    }
}
