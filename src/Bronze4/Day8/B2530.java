package Bronze4.Day8;

import java.util.Scanner;

public class B2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int h = 0;
        int m = 0;
        int s = 0;

        if (h == 24 || m == 60 || s == 60) {
            h = 0;
            m = 0;
            s = 0;
            if (D >= 3600) {
                h = A + D / 3600;
                m = B + (D % 3600) / 60;
                s = C + (D % 3600) % 60;
                System.out.println(h + m + s);
            } else if (D >= 60) {
                h = A;
                m = B + D / 60;
                s = C + D % 60;

                System.out.println(h + m + s);
            } else h = A;
            m = B;
            s = C + D;
            System.out.println(h + m + s);
        }
    }
}
