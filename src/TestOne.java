import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zwaclaw
 * @version 1.0
 */

public class TestOne{
    public static void main(String[] args) throws UnsupportedEncodingException,
            NoSuchAlgorithmException {
        byte[] theTextToDigestAsBytes=
                "Mano gyvenimas yra labai geras .."
                        .getBytes("8859_1");
        MessageDigest md= MessageDigest.getInstance("MD5");
        md.update(theTextToDigestAsBytes);
        byte[] digest= md.digest();

        for(byte b: digest){
            System.out.printf("%02X", b & 0xff);
        }
        System.out.println();
    }
}
