package Bronze5.Day3;

import java.util.Scanner;

public class B9068_다른답안2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));

        }
        sc.close();
    }
}
