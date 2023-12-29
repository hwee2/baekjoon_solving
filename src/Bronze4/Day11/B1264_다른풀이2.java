package Bronze4.Day11;

import java.util.Scanner;

public class B1264_다른풀이2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine().trim();
            int cnt = 0;

            if (str.equals("#")) {
                break;
            }

            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        cnt++;
                    default:
                        break;
                }
            }
            System.out.println(cnt);
        }
    }
}
