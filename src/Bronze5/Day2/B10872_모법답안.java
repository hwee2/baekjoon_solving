package Bronze5.Day2;

import java.util.Scanner;

public class B10872_모법답안 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(1);
        } else {
            int fac = 1;
            for (int i = 2; i <= N; i++) {
                fac *= i;
            }
            System.out.println(fac);
        }
    }
}
