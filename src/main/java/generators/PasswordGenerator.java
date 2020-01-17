package generators;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static SecureRandom random = new SecureRandom();

    private static final String LETRA_GRANDE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LETRA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERO = "0123456789";
    private static final String SIMBOLO = "!@#$%^&*_=+-/";

    public static String passwordGenerator(int len, String dic) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Password Generator:");
        System.out.println();

        int len;

        len = 6;
        System.out.println("Numero senha: " + len);
        String password = passwordGenerator(len, NUMERO);
        System.out.println(password);

        len = 6;
        System.out.println("Numero senha: " + len);
        String password2 = passwordGenerator(len, NUMERO + LETRA + LETRA_GRANDE);
        System.out.println(password2);

        len = 6;
        System.out.println("Numero senha: " + len);
        String password3 = passwordGenerator(len, NUMERO + LETRA + LETRA_GRANDE + SIMBOLO);
        System.out.println(password3);

    }
}

