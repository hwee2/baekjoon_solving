package Bronze4.Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B11365_다른풀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String text = br.readLine();
            if(text.equals("END")) break;

            StringBuffer str = new StringBuffer(text);
            String reverse = str.reverse().toString();
            System.out.println(reverse);
        }
    }
}