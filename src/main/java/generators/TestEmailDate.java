package generators;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TestEmailDate {

    public static void main(String[] args) {

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String date = new SimpleDateFormat("ddMMyyyyHHmmss").format(timestamp.getTime());
		System.out.println(date + "@test.com");
        System.out.println(System.nanoTime() + "@test.com");
    }
}
