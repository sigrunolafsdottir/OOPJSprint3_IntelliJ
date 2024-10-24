package URLDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReaderDemo {
    public static void main(String[] args) throws Exception {

        URL boken = new URL("https://www.dn.se");
        BufferedReader in = new BufferedReader(
            new InputStreamReader(boken.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
