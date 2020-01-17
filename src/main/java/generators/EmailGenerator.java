package generators;

import java.security.SecureRandom;

public class EmailGenerator {

    private static SecureRandom random = new SecureRandom();
    private static final String LETRA = "abcdefghijklmnopqrstuvwxyz";

    public static String emailGenerator(int len, String dic) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            System.out.println(index);
            result += dic.charAt(index);

        }
        return result;
    }
}
