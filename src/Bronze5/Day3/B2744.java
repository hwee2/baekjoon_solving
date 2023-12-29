package Bronze5.Day3;

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        char[] chars = sc.next().toCharArray();

        for(char c : chars) {
            if(Character.isUpperCase(c)) {
               result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
}
