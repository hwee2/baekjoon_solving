package Bronze4.Day11;

import java.util.Objects;
import java.util.Scanner;

public class B11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();
            String result = "";

            if(Objects.equals(text, "END")) break;

            for (int i = text.length() - 1; i >= 0; i--) {
                result += text.charAt(i);
            }
            System.out.println(result);
        }
    }
}